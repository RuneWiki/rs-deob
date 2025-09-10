package deob;

import java.util.Iterator;

@ObfuscatedName("qg")
public class class442 implements Iterable {

	@ObfuscatedName("qg.af")
	public class541 field5136 = new class541();

	@ObfuscatedName("qg.aw")
	public class541 field5135;

	public class442() {
		this.field5136.field5593 = this.field5136;
		this.field5136.field5594 = this.field5136;
	}

	@ObfuscatedName("qg.af(Lua;Lua;)V")
	public static void method8197(class541 arg0, class541 arg1) {
		if (arg0.field5594 != null) {
			arg0.method9759();
		}
		arg0.field5594 = arg1;
		arg0.field5593 = arg1.field5593;
		arg0.field5594.field5593 = arg0;
		arg0.field5593.field5594 = arg0;
	}

	@ObfuscatedName("qg.aw()V")
	public void method8190() {
		while (this.field5136.field5593 != this.field5136) {
			this.field5136.field5593.method9759();
		}
	}

	@ObfuscatedName("qg.at(Lua;)V")
	public void method8191(class541 arg0) {
		if (arg0.field5594 != null) {
			arg0.method9759();
		}
		arg0.field5594 = this.field5136.field5594;
		arg0.field5593 = this.field5136;
		arg0.field5594.field5593 = arg0;
		arg0.field5593.field5594 = arg0;
	}

	@ObfuscatedName("qg.ac()Lua;")
	public class541 method8192() {
		class541 var1 = this.field5136.field5593;
		if (this.field5136 == var1) {
			return null;
		} else {
			var1.method9759();
			return var1;
		}
	}

	@ObfuscatedName("qg.ap()Lua;")
	public class541 method8193() {
		return this.method8194(null);
	}

	@ObfuscatedName("qg.aq(Lua;)Lua;")
	public class541 method8194(class541 arg0) {
		class541 var2;
		if (arg0 == null) {
			var2 = this.field5136.field5593;
		} else {
			var2 = arg0;
		}
		if (this.field5136 == var2) {
			this.field5135 = null;
			return null;
		} else {
			this.field5135 = var2.field5593;
			return var2;
		}
	}

	@ObfuscatedName("qg.ao()Lua;")
	public class541 method8188() {
		class541 var1 = this.field5135;
		if (this.field5136 == var1) {
			this.field5135 = null;
			return null;
		} else {
			this.field5135 = var1.field5593;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class441(this);
	}
}
