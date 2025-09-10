package deob;

@ObfuscatedName("br")
public class class46 {

	@ObfuscatedName("br.ac")
	public final class563 field645;

	@ObfuscatedName("br.ap")
	public final class495 field643;

	@ObfuscatedName("br.aq")
	public final class493 field646;

	@ObfuscatedName("br.ao")
	public int field649 = 0;

	public class46(class563 arg0) {
		this.field645 = arg0;
		this.field643 = new class495(arg0);
		this.field646 = new class493(arg0);
	}

	@ObfuscatedName("he.af(Ljava/lang/String;I)V")
	public static final void method4211(String arg0) {
		class92.method2825(30, "", arg0);
	}

	@ObfuscatedName("qz.aw(Ljava/lang/String;B)V")
	public static final void method7995(String arg0) {
		method4211(arg0 + class394.field4663);
	}

	@ObfuscatedName("di.at(Ljava/lang/String;B)V")
	public static final void method3031(String arg0) {
		class330 var1 = class330.method3456(class328.field3593, client.field315.field1309);
		var1.field3665.method10320(class591.method5971(arg0));
		var1.field3665.method10504(arg0);
		client.field315.method2874(var1);
	}

	@ObfuscatedName("cg.ac(Ljava/lang/String;I)V")
	public static final void method1975(String arg0) {
		method4211(arg0 + class394.field4556);
	}

	@ObfuscatedName("gr.ap(Ljava/lang/String;I)V")
	public static final void method3687(String arg0) {
		class330 var1 = class330.method3456(class328.field3618, client.field315.field1309);
		var1.field3665.method10320(class591.method5971(arg0));
		var1.field3665.method10504(arg0);
		client.field315.method2874(var1);
	}

	@ObfuscatedName("dd.aq(Ljava/lang/String;II)V")
	public static final void method2629(String arg0, int arg1) {
		class330 var2 = class330.method3456(class328.field3561, client.field315.field1309);
		var2.field3665.method10320(class591.method5971(arg0) + 1);
		var2.field3665.method10504(arg0);
		var2.field3665.method10370(arg1);
		client.field315.method2874(var2);
	}

	@ObfuscatedName("br.ao(I)Z")
	public boolean method1506() {
		return this.field649 == 2;
	}

	@ObfuscatedName("br.as(S)V")
	public final void method1507() {
		this.field649 = 1;
	}

	@ObfuscatedName("br.al(Lwb;II)V")
	public final void method1563(class591 arg0, int arg1) {
		this.field643.method9182(arg0, arg1);
		this.field649 = 2;
		client.method6487();
	}

	@ObfuscatedName("br.au(I)V")
	public final void method1533() {
		for (class498 var1 = (class498) this.field643.field5375.method8174(); var1 != null; var1 = (class498) this.field643.field5375.method8167()) {
			if ((long) var1.field5390 < class335.method3987() / 1000L - 5L) {
				if (var1.field5389 > 0) {
					class92.method2825(5, "", var1.field5392 + class394.field4642);
				}
				if (var1.field5389 == 0) {
					class92.method2825(5, "", var1.field5392 + class394.field4643);
				}
				var1.method9755();
			}
		}
	}

	@ObfuscatedName("br.ai(I)V")
	public final void method1510() {
		this.field649 = 0;
		this.field643.method9262();
		this.field646.method9262();
	}

	@ObfuscatedName("br.aa(Lxa;ZS)Z")
	public final boolean method1511(class614 arg0, boolean arg1) {
		if (arg0 == null) {
			return false;
		} else if (arg0.equals(Statics.field1109.field935)) {
			return true;
		} else {
			return this.field643.method9181(arg0, arg1);
		}
	}

	@ObfuscatedName("br.am(Lxa;I)Z")
	public final boolean method1512(class614 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.field646.method9265(arg0);
		}
	}

	@ObfuscatedName("br.an(Ljava/lang/String;I)V")
	public final void method1513(String arg0) {
		if (arg0 == null) {
			return;
		}
		class614 var2 = new class614(arg0, this.field645);
		if (!var2.method11024()) {
			return;
		}
		if (this.method1514()) {
			method4211(class394.field4490);
		} else if (Statics.field1109.field935.equals(var2)) {
			method4211(class394.field4666);
		} else if (this.method1511(var2, false)) {
			method7995(arg0);
		} else if (this.method1512(var2)) {
			method4211(class394.field4780 + arg0 + class394.field4677);
		} else {
			method3031(arg0);
		}
	}

	@ObfuscatedName("br.ar(I)Z")
	public final boolean method1514() {
		return this.field643.method9284() || this.field643.method9263() >= 200 && client.field345 != 1;
	}

	@ObfuscatedName("br.ae(Ljava/lang/String;B)V")
	public final void method1508(String arg0) {
		if (arg0 == null) {
			return;
		}
		class614 var2 = new class614(arg0, this.field645);
		if (!var2.method11024()) {
			return;
		}
		if (this.method1515()) {
			method4211(class394.field4664);
		} else if (Statics.field1109.field935.equals(var2)) {
			method4211(class394.field4667);
		} else if (this.method1512(var2)) {
			method1975(arg0);
		} else if (this.method1511(var2, false)) {
			method4211(class394.field4670 + arg0 + class394.field4671);
		} else {
			method3687(arg0);
		}
	}

	@ObfuscatedName("br.ay(I)Z")
	public final boolean method1515() {
		return this.field646.method9284() || this.field646.method9263() >= 100 && client.field345 != 1;
	}

	@ObfuscatedName("br.ad(Ljava/lang/String;I)V")
	public final void method1538(String arg0) {
		if (arg0 == null) {
			return;
		}
		class614 var2 = new class614(arg0, this.field645);
		if (!var2.method11024()) {
			return;
		}
		if (this.field643.method9269(var2)) {
			client.field556 = client.field405;
			class330 var3 = class330.method3456(class328.field3639, client.field315.field1309);
			var3.field3665.method10320(class591.method5971(arg0));
			var3.field3665.method10504(arg0);
			client.field315.method2874(var3);
		}
		client.method6487();
	}

	@ObfuscatedName("br.ag(Ljava/lang/String;ZI)V")
	public final void method1518(String arg0, boolean arg1) {
		if (arg0 == null) {
			return;
		}
		class614 var3 = new class614(arg0, this.field645);
		if (!var3.method11024()) {
			return;
		}
		if (this.field646.method9269(var3)) {
			client.field556 = client.field405;
			if (arg1) {
				class330 var4 = class330.method3456(class328.field3608, client.field315.field1309);
				var4.field3665.method10320(class591.method5971(arg0));
				var4.field3665.method10504(arg0);
				client.field315.method2874(var4);
			}
		}
		client.method291();
	}

	@ObfuscatedName("br.av(Lxa;I)Z")
	public final boolean method1509(class614 arg0) {
		class497 var2 = (class497) this.field643.method9298(arg0);
		return var2 != null && var2.method9331();
	}
}
