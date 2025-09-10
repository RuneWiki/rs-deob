package deob;

@ObfuscatedName("be")
public class class42 {

	public class42() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gb.af(Ldr;Lwf;II)V")
	public static void method3669(class80 arg0, class590 arg1, int arg2) {
		int var3 = arg1.method10339();
		if (var3 < arg0.field1177.method9107()) {
			for (int var4 = var3; var4 < arg0.field1177.method9107(); var4++) {
				int var5 = arg0.field1177.method9104(var4);
				class80 var6 = client.field334.method2311(var5);
				if (var6 != null) {
					for (int var7 = 0; var7 < client.field336.field1255; var7++) {
						int var8 = client.field336.field1244[var7];
						client.field336.method2783((class70) var6.field1170.method7917((long) var8));
					}
					client.field334.method2337(var5);
				}
				class506 var9 = (class506) arg0.field1172.method7946((long) var5);
				if (var9 != null) {
					var9.method2234();
				}
			}
		}
		if (var3 > arg0.field1177.method9107()) {
			throw new RuntimeException("");
		}
		arg0.field1177.method9110();
		class280 var10 = new class280();
		for (int var11 = 0; var11 < var3; var11++) {
			int var12 = arg0.field1177.method9104(var11);
			class506 var13 = (class506) arg0.field1172.method7946((long) var12);
			int var14 = arg1.method10339();
			if (var14 == 0) {
				class80 var15 = client.field334.method2311(var12);
				if (var15 != null) {
					for (int var16 = 0; var16 < client.field336.field1255; var16++) {
						int var17 = client.field336.field1244[var16];
						client.field336.method2783((class70) var15.field1170.method7917((long) var17));
					}
					client.field334.method2337(var12);
				}
				if (var13 != null) {
					var13.method2234();
				}
			} else {
				arg0.field1177.method9115(var12);
				if (var14 != 1) {
					var10.method5837(var13.method9361());
					byte var18 = arg1.method10340();
					if (var18 != 0) {
						int var19 = class282.method6908(arg1, var18, 0);
						int var20 = class282.method6908(arg1, var18, 2);
						int var21 = class282.method6908(arg1, var18, 4);
						int var22 = class282.method6908(arg1, var18, 6);
						var10.method5856(var19, var20, var21, var22);
					}
					if (var14 == 2) {
						var13.method9350(var10);
					} else {
						var13.method9394(var10);
					}
				}
				if (arg2 >= 6) {
					method6910(var13, arg1);
				}
			}
		}
		while (arg1.method10293(client.field315.field1295) > 0) {
			int var23 = arg1.method10341();
			arg0.field1177.method9115(var23);
			int var24 = arg1.method10339();
			int var25 = arg1.method10339();
			int var26 = var24 * 8;
			int var27 = var25 * 8;
			class80 var28 = client.method1744(var23, var26, var27);
			class506 var29 = new class506(var23, var28);
			arg0.field1172.method7940(var29, (long) var23);
			var29.field5422 = var23;
			var29.field5432 = arg0.field1173;
			var29.method9343(class204.method3677(arg1.method10593()));
			class280 var30 = var29.field5423;
			var30.method5830(class357.method6807(0), class357.method6807(0));
			var30.method5849(0);
			var30.method5841(0);
			byte var31 = arg1.method10340();
			if (var31 != 0) {
				int var32 = class282.method6908(arg1, var31, 0);
				int var33 = class282.method6908(arg1, var31, 2);
				int var34 = class282.method6908(arg1, var31, 4);
				int var35 = class282.method6908(arg1, var31, 6);
				var30.method5856(var32, var33, var34, var35);
			}
			var29.method9350(var29.field5423);
			class395[] var37 = new class395[] { class395.field4797, class395.field4802, class395.field4798 };
			var29.method9346((class395) class432.method3817(var37, arg1.method10339()));
			if (arg2 >= 6) {
				method6910(var29, arg1);
			}
		}
	}

	@ObfuscatedName("oj.aw(Ltj;Lwf;I)V")
	public static void method6910(class506 arg0, class590 arg1) {
		int var2 = arg1.method10339();
		if ((var2 & 0x1) != 0) {
		}
		if ((var2 & 0x2) != 0) {
			arg0.method9347(arg1.method10339());
		}
	}
}
