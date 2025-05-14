import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BooksService {
  private apiUrl = "http://localhost:8080/books";
  searchQuery: any;

  constructor(private http: HttpClient) {}

  getBooks() {
    return this.http.get(this.apiUrl);
  }

  postBook(book: { isbn: String; title: String; aName: String; genre: String }) {
    return this.http.post(this.apiUrl, book);
  }

  deleteBooks(book: {title: string}){
    return this.http.delete(this.apiUrl + '/' + book.title);
  }

  updateBooks(book:{title: string}){
    return this.http.put(this.apiUrl + '/' + book.title, book);
  }
}