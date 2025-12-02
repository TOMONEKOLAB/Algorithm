function swap(a, b) {
    let tmp = a.value;
    a.value = b.value;
    b.value = tmp;
}

// Temporary variable swap
let a = { value: 5 };
let b = { value: 10 };
console.log("Using temporary variable swap:");
console.log(`Before swap: a = ${a.value}, b = ${b.value}`);
swap(a, b);
console.log(`After  swap: a = ${a.value}, b = ${b.value}`);
console.log("========================");

// XOR swap
let x = 15;
let y = 25;
console.log("Using XOR swap:");
console.log(`Before XOR swap: x = ${x}, y = ${y}`);
x = x ^ y;
y = x ^ y;
x = x ^ y;
console.log(`After  XOR swap: x = ${x}, y = ${y}`);
console.log("========================");

// Addition/subtraction swap
let m = 30;
let n = 45;
console.log("Using addition and subtraction swap:");
console.log(`Before add/sub swap: m = ${m}, n = ${n}`);
n = m - n;
m = m - n;
n = n + m;
console.log(`After  add/sub swap: m = ${m}, n = ${n}`);
console.log("========================");
