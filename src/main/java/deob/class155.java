package deob;

@ObfuscatedName("fz")
public class class155 {

	@ObfuscatedName("fz.ae")
	public long field1794;

	@ObfuscatedName("fz.ay")
	public int field1788 = -1;

	@ObfuscatedName("fz.ad")
	public class439 field1795 = new class439();

	public class155(class591 arg0) {
		this.method3658(arg0);
	}

	@ObfuscatedName("fz.af(Lwb;I)V")
	public void method3658(class591 arg0) {
		this.field1794 = arg0.method10346();
		this.field1788 = arg0.method10345();
		for (int var2 = arg0.method10339(); var2 != 0; var2 = arg0.method10339()) {
			class152 var3;
			if (var2 == 3) {
				var3 = new class174(this);
			} else if (var2 == 1) {
				var3 = new class150(this);
			} else if (var2 == 13) {
				var3 = new class167(this);
			} else if (var2 == 4) {
				var3 = new class159(this);
			} else if (var2 == 6) {
				var3 = new class166(this);
			} else if (var2 == 5) {
				var3 = new class151(this);
			} else if (var2 == 2) {
				var3 = new class156(this);
			} else if (var2 == 7) {
				var3 = new class149(this);
			} else if (var2 == 14) {
				var3 = new class153(this);
			} else if (var2 == 8) {
				var3 = new class170(this);
			} else if (var2 == 9) {
				var3 = new class176(this);
			} else if (var2 == 10) {
				var3 = new class162(this);
			} else if (var2 == 11) {
				var3 = new class157(this);
			} else if (var2 == 12) {
				var3 = new class161(this);
			} else if (var2 == 15) {
				var3 = new class171(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method3645(arg0);
			this.field1795.method8093(var3);
		}
	}

	@ObfuscatedName("fz.aw(Lgs;B)V")
	public void method3660(class163 arg0) {
		if (this.field1794 != arg0.field1846 || this.field1788 != arg0.field1871) {
			throw new RuntimeException("");
		}
		for (class152 var2 = (class152) this.field1795.method8092(); var2 != null; var2 = (class152) this.field1795.method8106()) {
			var2.method3646(arg0);
		}
		arg0.field1871++;
	}
}
