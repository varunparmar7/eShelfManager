import { Component } from '@angular/core';
import { BooksService } from '../../books.service';

@Component({
  selector: 'app-update-books',
  templateUrl: './update-books.component.html',
  styleUrl: './update-books.component.css'
})
export class UpdateBooksComponent {
  book = { isbn: '', title: '', aName: '', genre:''};

  constructor(private booksService: BooksService) {}

  ngOnInit(): void {}

  onSubmit() {
    this.booksService.updateBooks(this.book).subscribe(response => {
      console.log('Book added successfully:', response);
      this.book = { isbn: '', title: '', aName: '', genre:''};
    }, error => {
      console.error('Error adding book:', error);
    });
  }
}
