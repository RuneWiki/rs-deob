package deob;

@ObfuscatedName("my")
public class class330 extends class545 {

	@ObfuscatedName("my.ac")
	public static class330[] field3663 = new class330[300];

	@ObfuscatedName("my.ap")
	public static int field3662 = 0;

	@ObfuscatedName("my.aq")
	public class328 field3659;

	@ObfuscatedName("my.ao")
	public int field3664;

	@ObfuscatedName("my.as")
	public class590 field3665;

	@ObfuscatedName("my.al")
	public int field3666;

	@ObfuscatedName("fv.af(Lmn;Lxj;I)Lmy;")
	public static class330 method3456(class328 arg0, class609 arg1) {
		class330 var2;
		if (field3662 == 0) {
			var2 = new class330();
		} else {
			var2 = field3663[--field3662];
		}
		var2.field3659 = arg0;
		var2.field3664 = arg0.field3643;
		if (var2.field3664 == -1) {
			var2.field3665 = new class590(260);
		} else if (var2.field3664 == -2) {
			var2.field3665 = new class590(10000);
		} else if (var2.field3664 <= 18) {
			var2.field3665 = new class590(20);
		} else if (var2.field3664 <= 98) {
			var2.field3665 = new class590(100);
		} else {
			var2.field3665 = new class590(260);
		}
		var2.field3665.method10295(arg1);
		var2.field3665.method10288(var2.field3659.field3584);
		var2.field3666 = 0;
		return var2;
	}

	@ObfuscatedName("my.aw(I)V")
	public void method6488() {
		if (field3662 < field3663.length) {
			field3663[++field3662 - 1] = this;
		}
	}
}
