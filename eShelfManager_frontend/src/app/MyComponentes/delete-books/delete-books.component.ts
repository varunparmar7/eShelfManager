import { Component } from '@angular/core';
import { BooksService } from '../../books.service';

@Component({
  selector: 'app-delete-books',
  templateUrl: './delete-books.component.html',
  styleUrl: './delete-books.component.css'
})
export class DeleteBooksComponent {
  book = { title: ''};

  constructor(private booksService: BooksService) {}

  ngOnInit(): void {}

  onSubmit() {
    this.booksService.deleteBooks(this.book).subscribe(response => {
      console.log('Book added successfully:', response);
      this.book = { title: ''};
    }, error => {
      console.error('Error adding book:', error);
    });
  }
}
