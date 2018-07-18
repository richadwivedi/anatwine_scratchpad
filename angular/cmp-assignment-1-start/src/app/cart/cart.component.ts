import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-cart',
  styleUrls: ['./cart.component.css'],
  template : `
    <p>Initial Cart Contents: {{ initialCart }}</p>
    <input type="text" [(ngModel)]="newItem">
    <button (click)="onButtonClick($event)">Add Item</button>
`
})
export class CartComponent implements OnInit {
  @Input() name = 'Richa';
  @Input() initialCart = []; // new Array<string>('Richa', 'Dwivedi');
  newItem = ''; // new EventEmitter<Array<string>>();
  @Output() itemAdded = new EventEmitter<string>();

  constructor() { }

  ngOnInit() {
  }

  onButtonClick(event) {
    this.itemAdded.emit(this.newItem);
  }
}
