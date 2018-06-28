import { Component } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  template: `
  <input type="text" [(ngModel)]="name">
  <p>Hello {{ name }}!<p>
  <p>I'm a Dashboard component</p>
  <p>Current Load State is: {{ loadState }}</p>
  <button (click)='onUserClick($event)'>Update Load State</button>
  <!--
  <p>Counter</p>
    <p>Click the button:</p>
    <button ng-click="count = count + 1" ng-init="count=0">OK</button>
    <p>The button has been clicked {{ count }} times.</p> -->
  <p>~~~~~~~~~~~~~~~~~~~ Cart ~~~~~~~~~~~~~~~~~~~~~</p>
  `
})
export class DashboardComponent {
  name = 'Richa';
  loadState = 'loading';
  count = 0;

  onUserClick(event) {
    this.loadState = 'finished';
  }
}
