package main

import (
	"fmt"
	"os"
)

func main() {

	args := os.Args
	fmt.Printf("hello Anvesh\nArguments: %s\nArgument: %v\n", args, args[1])
}
