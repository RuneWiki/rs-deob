package deob;

@ObfuscatedName("hd")
public class class183 extends class541 {

	@ObfuscatedName("hd.ap")
	public static class321 field1981 = new class321(64);

	@ObfuscatedName("hd.aq")
	public int field1983 = 0;

	@ObfuscatedName("kd.af(Lpx;I)V")
	public static void method5596(class413 arg0) {
		Statics.field1982 = arg0;
		Statics.field9 = Statics.field1982.method7702(16);
	}

	@ObfuscatedName("hd.ac(Lwb;I)V")
	public void method3867(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				this.method3869();
				return;
			}
			this.method3868(arg0, var2);
		}
	}

	@ObfuscatedName("hd.ap(Lwb;IB)V")
	public void method3868(class591 arg0, int arg1) {
		if (arg1 == 5) {
			this.field1983 = arg0.method10341();
		}
	}

	@ObfuscatedName("hd.aq(B)V")
	public void method3869() {
	}
}
