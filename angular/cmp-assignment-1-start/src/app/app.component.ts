import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  rootCart = ['Apples', 'Bananas', 'Cherries'];

  onAddItem(newItem) {
    this.rootCart = this.rootCart + newItem;
  }
}
