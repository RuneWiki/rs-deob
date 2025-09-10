package deob;

@ObfuscatedName("cp")
public class class58 {

	@ObfuscatedName("cp.aw")
	public class40[] field820 = new class40[100];

	@ObfuscatedName("cp.at")
	public int field822;

	@ObfuscatedName("cp.af(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbz;")
	public class40 method1979(int arg0, String arg1, String arg2, String arg3) {
		class40 var5 = this.field820[99];
		for (int var6 = this.field822; var6 > 0; var6--) {
			if (var6 != 100) {
				this.field820[var6] = this.field820[var6 - 1];
			}
		}
		if (var5 == null) {
			var5 = new class40(arg0, arg1, arg3, arg2);
		} else {
			var5.method2234();
			var5.method9759();
			var5.method743(arg0, arg1, arg3, arg2);
		}
		this.field820[0] = var5;
		if (this.field822 < 100) {
			this.field822++;
		}
		return var5;
	}

	@ObfuscatedName("cp.aw(IB)Lbz;")
	public class40 method1980(int arg0) {
		return arg0 >= 0 && arg0 < this.field822 ? this.field820[arg0] : null;
	}

	@ObfuscatedName("cp.at(S)I")
	public int method1986() {
		return this.field822;
	}
}
