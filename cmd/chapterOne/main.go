package main

import "fmt"

func main(){
	fmt.Printf("1 - Given ((%d+%d) / %d) , print the result: %d\n", 0, 15, 2, (0+15)/2)
	fmt.Printf("2 - %e\n", 2.0e-6 * 100000000.1)
	fmt.Printf("3 - %t\n", true && false || true && true)
}