import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-user',
  template: `
   <input type="text" (input)="onUserInput($event)" [value]="myName">
  <!-- <input type="text" [(ngModel)]="name"> -->
  <p>Hello {{ myName }}!<p>
  <p>I'm a User component</p>
  <app-user-detail></app-user-detail>
  `
})
export class UserComponent {
  @Input() myName; // = 'Richa';
  @Output() nameChanged = new EventEmitter<string>();


  onUserInput(event) {
    // this.name = event.target.value;
    this.nameChanged.emit(event.target.value);
  }
}
