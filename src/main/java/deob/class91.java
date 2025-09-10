package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dy")
public class class91 {

	@ObfuscatedName("dy.at")
	public boolean[] field1277;

	@ObfuscatedName("dy.ac")
	public Map field1278;

	@ObfuscatedName("dy.ap")
	public boolean field1275 = false;

	@ObfuscatedName("dy.aq")
	public long field1280;

	public class91() {
		int var1 = Statics.field1987.method7702(19);
		this.field1278 = new HashMap();
		this.field1277 = new boolean[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			class186 var3 = (class186) class186.field2016.method6463((long) var2);
			class186 var4;
			if (var3 == null) {
				byte[] var5 = Statics.field2019.method7692(19, var2);
				class186 var6 = new class186();
				if (var5 != null) {
					var6.method3910(new class591(var5));
				}
				class186.field2016.method6454(var6, (long) var2);
				var4 = var6;
			} else {
				var4 = var3;
			}
			this.field1277[var2] = var4.field2017;
		}
		this.method2820();
	}

	@ObfuscatedName("dy.af(III)V")
	public void method2813(int arg0, int arg1) {
		this.field1278.put(arg0, arg1);
		if (this.field1277[arg0]) {
			this.field1275 = true;
		}
	}

	@ObfuscatedName("dy.aw(IS)I")
	public int method2848(int arg0) {
		Object var2 = this.field1278.get(arg0);
		return var2 instanceof Integer ? (Integer) var2 : -1;
	}

	@ObfuscatedName("dy.at(ILjava/lang/String;I)V")
	public void method2815(int arg0, String arg1) {
		this.field1278.put(arg0, arg1);
	}

	@ObfuscatedName("dy.ac(IB)Ljava/lang/String;")
	public String method2816(int arg0) {
		Object var2 = this.field1278.get(arg0);
		return var2 instanceof String ? (String) var2 : "";
	}

	@ObfuscatedName("dy.ap(I)V")
	public void method2817() {
		for (int var1 = 0; var1 < this.field1277.length; var1++) {
			if (!this.field1277[var1]) {
				this.field1278.remove(var1);
			}
		}
	}

	@ObfuscatedName("dy.aq(ZI)Lvx;")
	public class566 method2818(boolean arg0) {
		return class261.method496("2", Statics.field5085.field4420, arg0);
	}

	@ObfuscatedName("dy.ao(B)V")
	public void method2819() {
		class566 var1 = this.method2818(true);
		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.field1278.entrySet().iterator();
			while (var4.hasNext()) {
				Entry var5 = (Entry) var4.next();
				int var6 = (Integer) var5.getKey();
				if (this.field1277[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class591.method5971((String) var7);
					}
					var3++;
				}
			}
			class591 var8 = new class591(var2);
			var8.method10320(2);
			var8.method10321(var3);
			Iterator var9 = this.field1278.entrySet().iterator();
			while (var9.hasNext()) {
				Entry var10 = (Entry) var9.next();
				int var11 = (Integer) var10.getKey();
				if (this.field1277[var11]) {
					var8.method10321(var11);
					Object var12 = var10.getValue();
					class575 var13 = class575.method10166(var12.getClass());
					var8.method10320(var13.field5816);
					class575.method10167(var12, var8);
				}
			}
			var1.method10085(var8.field5917, 0, var8.field5920);
		} catch (Exception var25) {
		} finally {
			try {
				var1.method10067();
			} catch (Exception var24) {
			}
		}
		this.field1275 = false;
		this.field1280 = class335.method3987();
	}

	@ObfuscatedName("dy.as(I)V")
	public void method2820() {
		class566 var1 = this.method2818(false);
		label219: {
			try {
				byte[] var2 = new byte[(int) var1.method10081()];
				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.method10070(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}
				class591 var5 = new class591(var2);
				if (var5.field5917.length - var5.field5920 < 1) {
					return;
				}
				int var7 = var5.method10339();
				if (var7 >= 0 && var7 <= 2) {
					if (var7 >= 2) {
						int var9 = var5.method10341();
						int var10 = 0;
						while (true) {
							if (var10 >= var9) {
								break label219;
							}
							int var11 = var5.method10341();
							int var12 = var5.method10339();
							class575 var13 = (class575) class432.method3817(class575.method10175(), var12);
							Object var14 = var13.method10173(var5);
							if (var11 >= 0 && var11 < this.field1277.length && this.field1277[var11]) {
								this.field1278.put(var11, var14);
							}
							var10++;
						}
					} else {
						int var15 = var5.method10341();
						for (int var16 = 0; var16 < var15; var16++) {
							int var17 = var5.method10341();
							int var18 = var5.method10345();
							if (var17 >= 0 && var17 < this.field1277.length && this.field1277[var17]) {
								this.field1278.put(var17, var18);
							}
						}
						int var19 = var5.method10341();
						int var20 = 0;
						while (true) {
							if (var20 >= var19) {
								break label219;
							}
							var5.method10341();
							var5.method10350();
							var20++;
						}
					}
				}
			} catch (Exception var34) {
				break label219;
			} finally {
				try {
					var1.method10067();
				} catch (Exception var33) {
				}
			}
			return;
		}
		this.field1275 = false;
	}

	@ObfuscatedName("dy.al(B)V")
	public void method2827() {
		if (this.field1275 && this.field1280 < class335.method3987() - 60000L) {
			this.method2819();
		}
	}

	@ObfuscatedName("dy.au(I)Z")
	public boolean method2846() {
		return this.field1275;
	}
}
