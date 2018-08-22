/**
 * 
 */
package com.model;

/**
 * @author Ashwin
 *
 */
public class Maths {

	private int add;
	private int sub;
	private long sqrt;
	private float pi;

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public long getSqrt() {
		return sqrt;
	}

	public void setSqrt(long sqrt) {
		this.sqrt = sqrt;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public void display() {
		System.out.println("Add : " + this.add + "\nSub : " + this.sub);
		System.out.println("Square Root : " + this.sqrt + "\nPI : " + this.pi);
	}

}
