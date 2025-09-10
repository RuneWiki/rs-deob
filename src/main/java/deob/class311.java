package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lq")
public class class311 extends class290 {

	@ObfuscatedName("lq.an")
	public HashSet field3504;

	@ObfuscatedName("lq.ar")
	public HashSet field3503;

	@ObfuscatedName("lq.ae")
	public List field3505;

	@ObfuscatedName("lq.dr(Lwb;Lwb;IZI)V")
	public void method6360(class591 arg0, class591 arg1, int arg2, boolean arg3) {
		this.method5973(arg0, arg2);
		int var5 = arg1.method10341();
		this.field3504 = new HashSet(var5);
		for (int var6 = 0; var6 < var5; var6++) {
			class285 var7 = new class285();
			try {
				var7.method5914(arg1);
			} catch (IllegalStateException var14) {
				continue;
			}
			this.field3504.add(var7);
		}
		int var9 = arg1.method10341();
		this.field3503 = new HashSet(var9);
		for (int var10 = 0; var10 < var9; var10++) {
			class293 var11 = new class293();
			try {
				var11.method6253(arg1);
			} catch (IllegalStateException var13) {
				continue;
			}
			this.field3503.add(var11);
		}
		this.method6363(arg1, arg3);
	}

	@ObfuscatedName("lq.ds(Lwb;ZI)V")
	public void method6363(class591 arg0, boolean arg1) {
		this.field3505 = new LinkedList();
		int var3 = arg0.method10341();
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = arg0.method10365();
			class357 var6 = new class357(arg0.method10345());
			boolean var7 = arg0.method10339() == 1;
			if (arg1 || !var7) {
				this.field3505.add(new class296(null, var6, var5, null));
			}
		}
	}
}
