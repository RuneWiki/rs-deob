package deob;

@ObfuscatedName("rh")
public class class467 {

	@ObfuscatedName("rh.af")
	public class463 field5269;

	@ObfuscatedName("rh.aw")
	public int field5270 = 0;

	@ObfuscatedName("rh.at")
	public int field5274 = 0;

	public class467(class463 arg0, int arg1, int arg2) {
		this.field5269 = arg0;
		this.field5270 = arg1;
		this.field5274 = arg2;
	}

	@ObfuscatedName("rh.af(S)Ljava/lang/String;")
	public String method8853() {
		if (this.method8868()) {
			return "";
		}
		StringBuilder var1 = new StringBuilder(this.method8867());
		for (int var2 = this.field5270; var2 < this.field5274; var2++) {
			class465 var3 = this.field5269.method8726(var2);
			var1.append(var3.field5243);
		}
		return var1.toString();
	}

	@ObfuscatedName("rh.aw(II)Z")
	public boolean method8852(int arg0) {
		return this.field5269.method8631() == 2 || this.field5269.method8631() == 1 && (!this.field5269.field5233 || this.field5274 - 1 != arg0);
	}

	@ObfuscatedName("rh.at(I)Z")
	public boolean method8868() {
		return this.field5274 == this.field5270;
	}

	@ObfuscatedName("rh.ac(I)I")
	public int method8867() {
		return this.field5274 - this.field5270;
	}

	@ObfuscatedName("rh.ap(Lrx;B)Z")
	public boolean method8857(class465 arg0) {
		if (this.field5269.field5221 == 2) {
			return true;
		} else if (this.field5269.field5221 == 0) {
			return false;
		} else {
			return this.field5269.method8612() != arg0;
		}
	}

	@ObfuscatedName("rh.aq(B)I")
	public int method8855() {
		if (this.method8868()) {
			return 0;
		}
		class465 var1 = this.field5269.method8726(this.field5274 - 1);
		if (var1.field5243 == '\n') {
			return 0;
		} else if (this.method8857(var1)) {
			return this.field5269.field5229.field5246[42];
		} else {
			int var2 = this.field5269.field5229.field5246[var1.field5243];
			if (var2 == 0) {
				return var1.field5243 == '\t' ? this.field5269.field5229.field5246[32] * 3 : this.field5269.field5229.field5246[32];
			} else {
				return var2;
			}
		}
	}

	@ObfuscatedName("rh.ao(I)Lvt;")
	public class558 method8859() {
		if (this.method8868()) {
			return new class558(0, 0);
		} else {
			class465 var1 = this.field5269.method8726(this.field5274 - 1);
			return new class558(var1.field5242 + this.method8855(), var1.field5245);
		}
	}

	@ObfuscatedName("rh.as(II)Lrx;")
	public class465 method8860(int arg0) {
		return arg0 >= 0 && arg0 < this.method8867() ? this.field5269.method8726(this.field5270 + arg0) : null;
	}
}
