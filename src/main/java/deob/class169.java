package deob;

@ObfuscatedName("ga")
public class class169 {

	@ObfuscatedName("ga.aq")
	public long field1896;

	@ObfuscatedName("ga.ao")
	public long field1899 = -1L;

	@ObfuscatedName("ga.as")
	public class439 field1901 = new class439();

	public class169(class591 arg0) {
		this.method3780(arg0);
	}

	@ObfuscatedName("ga.af(Lwb;B)V")
	public void method3780(class591 arg0) {
		this.field1896 = arg0.method10346();
		this.field1899 = arg0.method10346();
		for (int var2 = arg0.method10339(); var2 != 0; var2 = arg0.method10339()) {
			class168 var3;
			if (var2 == 1) {
				var3 = new class164(this);
			} else if (var2 == 4) {
				var3 = new class175(this);
			} else if (var2 == 3) {
				var3 = new class160(this);
			} else if (var2 == 2) {
				var3 = new class158(this);
			} else if (var2 == 5) {
				var3 = new class165(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method3670(arg0);
			this.field1901.method8093(var3);
		}
	}

	@ObfuscatedName("ga.aw(Lgm;I)V")
	public void method3785(class172 arg0) {
		if (this.field1896 != arg0.field5601 || this.field1899 != arg0.field1923) {
			throw new RuntimeException("");
		}
		for (class168 var2 = (class168) this.field1901.method8092(); var2 != null; var2 = (class168) this.field1901.method8106()) {
			var2.method3671(arg0);
		}
		arg0.field1923++;
	}
}
