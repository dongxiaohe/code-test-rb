package com.codetest.util

package object util {
  type ErrorOr[T] = Either[Throwable, T]
}
