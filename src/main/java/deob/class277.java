package deob;

import java.util.Arrays;

@ObfuscatedName("kq")
public class class277 {

	@ObfuscatedName("kq.af")
	public static final class277 field3249 = new class277(0, 8, 8);

	@ObfuscatedName("kq.aw")
	public static final class277 field3246 = new class277(5, 16, 16);

	@ObfuscatedName("kq.at")
	public static final class277 field3247 = new class277(6, 32, 32);

	@ObfuscatedName("kq.ac")
	public static final class277 field3248 = new class277(1, 48, 48);

	@ObfuscatedName("kq.ap")
	public static final class277 field3253 = new class277(2, 64, 64);

	@ObfuscatedName("kq.aq")
	public static final class277 field3250 = new class277(4, 96, 96);

	@ObfuscatedName("kq.ao")
	public static final class277 field3251 = new class277(3, 128, 128);

	@ObfuscatedName("kq.as")
	public final int field3252;

	@ObfuscatedName("kq.al")
	public static final class277[] field3245 = Statics.method1503();

	@ObfuscatedName("kq.au")
	public final int field3254;

	@ObfuscatedName("kq.ai")
	public final int field3255;

	static {
		Arrays.sort(field3245, new class284());
	}

	public class277(int arg0, int arg1, int arg2) {
		this.field3252 = arg0;
		this.field3254 = arg1;
		this.field3255 = arg2;
	}

	@ObfuscatedName("kq.aw(I)I")
	public int method5790() {
		return this.field3255 * this.field3254;
	}
}
