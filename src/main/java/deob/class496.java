package deob;

@ObfuscatedName("tg")
public class class496 extends class502 {

	@ObfuscatedName("tg.aw")
	public final class563 field5383;

	@ObfuscatedName("tg.at")
	public final class494 field5378;

	@ObfuscatedName("tg.ac")
	public String field5380 = null;

	@ObfuscatedName("tg.ap")
	public String field5377 = null;

	@ObfuscatedName("tg.aq")
	public byte field5381;

	@ObfuscatedName("tg.ao")
	public int field5382;

	@ObfuscatedName("tg.as")
	public int field5379 = 1;

	public class496(class563 arg0, class494 arg1) {
		super(500);
		this.field5383 = arg0;
		this.field5378 = arg1;
	}

	@ObfuscatedName("tg.af(I)Ltl;")
	public class500 method9174() {
		return new class499();
	}

	@ObfuscatedName("tg.aw(IB)[Ltl;")
	public class500[] method9170(int arg0) {
		return new class499[arg0];
	}

	@ObfuscatedName("tg.at(Ljava/lang/String;B)V")
	public final void method9195(String arg0) {
		long var2 = 0L;
		int var4 = arg0.length();
		for (int var5 = 0; var5 < var4; var5++) {
			var2 *= 37L;
			char var6 = arg0.charAt(var5);
			if (var6 >= 'A' && var6 <= 'Z') {
				var2 += var6 + 1 - 65;
			} else if (var6 >= 'a' && var6 <= 'z') {
				var2 += var6 + 1 - 97;
			} else if (var6 >= '0' && var6 <= '9') {
				var2 += var6 + 27 - 48;
			}
			if (var2 >= 177917621779460413L) {
				break;
			}
		}
		while (var2 % 37L == 0L && var2 != 0L) {
			var2 /= 37L;
		}
		String var9 = class448.method3988(var2);
		if (var9 == null) {
			var9 = "";
		}
		this.field5380 = var9;
	}

	@ObfuscatedName("tg.al(Ljava/lang/String;B)V")
	public final void method9189(String arg0) {
		this.field5377 = class448.method6752(arg0);
	}

	@ObfuscatedName("tg.au(Lwb;B)V")
	public final void method9191(class591 arg0) {
		this.method9189(arg0.method10350());
		long var2 = arg0.method10346();
		long var4 = var2;
		String var6;
		if (var2 <= 0L || var2 >= 6582952005840035281L) {
			var6 = null;
		} else if (var2 % 37L == 0L) {
			var6 = null;
		} else {
			int var7 = 0;
			for (long var8 = var2; var8 != 0L; var8 /= 37L) {
				var7++;
			}
			StringBuilder var10 = new StringBuilder(var7);
			while (var4 != 0L) {
				long var11 = var4;
				var4 /= 37L;
				var10.append(class448.field5152[(int) (var11 - var4 * 37L)]);
			}
			var6 = var10.reverse().toString();
		}
		this.method9195(var6);
		this.field5381 = arg0.method10340();
		int var13 = arg0.method10356();
		if (var13 == -1) {
			return;
		}
		this.method9262();
		for (int var14 = 0; var14 < var13; var14++) {
			class499 var15 = (class499) this.method9301(new class614(arg0.method10350(), this.field5383));
			int var16 = arg0.method10341();
			var15.method9329(var16, ++this.field5379 - 1);
			var15.field5413 = arg0.method10340();
			arg0.method10350();
			this.method9188(var15);
		}
	}

	@ObfuscatedName("tg.ai(Lwb;I)V")
	public final void method9192(class591 arg0) {
		class614 var2 = new class614(arg0.method10350(), this.field5383);
		int var3 = arg0.method10341();
		byte var4 = arg0.method10340();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}
		if (var5) {
			if (this.method9263() == 0) {
				return;
			}
			class499 var6 = (class499) this.method9267(var2);
			if (var6 != null && var6.method9330() == var3) {
				this.method9299(var6);
			}
			return;
		}
		arg0.method10350();
		class499 var7 = (class499) this.method9267(var2);
		if (var7 == null) {
			if (this.method9263() > this.field5407) {
				return;
			}
			var7 = (class499) this.method9301(var2);
		}
		var7.method9329(var3, ++this.field5379 - 1);
		var7.field5413 = var4;
		this.method9188(var7);
	}

	@ObfuscatedName("tg.aa(B)V")
	public final void method9193() {
		for (int var1 = 0; var1 < this.method9263(); var1++) {
			((class499) this.method9273(var1)).method9224();
		}
	}

	@ObfuscatedName("tg.am(I)V")
	public final void method9194() {
		for (int var1 = 0; var1 < this.method9263(); var1++) {
			((class499) this.method9273(var1)).method9226();
		}
	}

	@ObfuscatedName("tg.an(Ltp;I)V")
	public final void method9188(class499 arg0) {
		if (arg0.method9244().equals(this.field5378.method1361())) {
			this.field5382 = arg0.field5413;
		}
	}
}
