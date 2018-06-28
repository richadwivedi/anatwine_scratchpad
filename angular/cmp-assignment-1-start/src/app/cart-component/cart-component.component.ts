import { Component, OnInit, Output, Input, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-cart-component',
  styleUrls: ['./cart-component.component.css'],
  template : `
    <p>Cart Contents: {{ initialCart }}</p>
    <p>Add Item: <input type="text" ></p>
    <button (click)='onButtonClick($event)'>Add</button>
  `
})
export class CartComponentComponent implements OnInit {
  @Input() name = 'Richa';
  @Input() initialCart = new Array<string>(); // new Array<string>('Richa', 'Dwivedi');
  @Output() updatedCart = new EventEmitter<Array<string>>();

  constructor() { }

  ngOnInit() {
  }

  onButtonClick(event) {
    // this.name = event.target.value;
    this.updatedCart.emit(event.target.value);
  }
}
