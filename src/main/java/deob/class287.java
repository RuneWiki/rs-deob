package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ld")
public class class287 {

    @ObfuscatedName("ld.ax")
    public static class315 field3123 = new class315(37748736, 256);

    @ObfuscatedName("ld.aq")
    public int field3114;

    @ObfuscatedName("ld.af")
    public int field3118;

    @ObfuscatedName("ld.at")
    public class281 field3119;

    @ObfuscatedName("ld.au")
    public LinkedList field3124;

    @ObfuscatedName("ld.ar")
    public int field3121;

    @ObfuscatedName("ld.al")
    public int field3120;

    @ObfuscatedName("ld.ad")
    public List field3117;

    @ObfuscatedName("ld.ah")
    public HashMap field3116;

    @ObfuscatedName("ld.ap")
    public final HashMap field3125;

    @ObfuscatedName("kb.ac(Lvv;IIII)V")
    public static void method5195(class565 arg0, int arg1, int arg2, int arg3) {
        class315 var4 = field3123;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method5704(arg0, var6, arg0.field5513.length * 4);
    }

    @ObfuscatedName("as.ae(B)V")
    public static void method280() {
        field3123.method5709();
    }

    @ObfuscatedName("ax.ag(I)V")
    public static void method10() {
        field3123.method5708(5);
    }

    public class287(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field3114 = arg0;
        this.field3118 = arg1;
        this.field3124 = new LinkedList();
        this.field3117 = new LinkedList();
        this.field3116 = new HashMap();
        this.field3121 = arg2 | 0xFF000000;
        this.field3125 = arg3;
    }

    @ObfuscatedName("ld.am(IIII)V")
    public void method5459(int arg0, int arg1, int arg2) {
        int var4 = this.field3114;
        int var5 = this.field3118;
        int var6 = this.field3120;
        class315 var7 = field3123;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class565 var10 = (class565) var7.method5703(var8);
        if (var10 == null) {
            return;
        }
        if (this.field3120 * 64 == arg2) {
            var10.method9513(arg0, arg1);
        } else {
            var10.method9443(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ld.ax(Lkv;Ljava/util/List;B)V")
    public void method5365(class281 arg0, List arg1) {
        this.field3116.clear();
        this.field3119 = arg0;
        this.method5437(arg1);
    }

    @ObfuscatedName("ld.aq(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method5382(HashSet arg0, List arg1) {
        this.field3116.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class289 var4 = (class289) var3.next();
            if (var4.method5574() == this.field3114 && var4.method5592() == this.field3118) {
                this.field3124.add(var4);
            }
        }
        this.method5437(arg1);
    }

    @ObfuscatedName("ld.af(IIIILla;B)V")
    public void method5367(int arg0, int arg1, int arg2, int arg3, class295 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3195; var8++) {
                    class297[] var9 = arg4.field3202[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class297[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class297 var12 = var10[var11];
                            class210 var13 = class210.method5152(var12.field3217);
                            if (method6991(var13)) {
                                this.method5368(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ld.at(Lid;IIILla;I)V")
    public void method5368(class210 arg0, int arg1, int arg2, int arg3, class295 arg4) {
        class352 var6 = new class352(arg1, this.field3114 * 64 + arg2, this.field3118 * 64 + arg3);
        Object var7 = null;
        class352 var8;
        if (this.field3119 == null) {
            class289 var9 = (class289) arg4;
            var8 = new class352(var9.field3194 + arg1, var9.field3200 * 64 + arg2 + var9.method5541() * 8, var9.field3191 * 64 + arg3 + var9.method5528() * 8);
        } else {
            var8 = new class352(this.field3119.field3194 + arg1, this.field3119.field3200 * 64 + arg2, this.field3119.field3191 * 64 + arg3);
        }
        class304 var10;
        if (arg0.field2212 == null) {
            class184 var11 = class184.method3200(arg0.field2199);
            var10 = new class292(var8, var6, var11.field1901, this.method5394(var11));
        } else {
            var10 = new class284(var8, var6, arg0.field2178, this);
        }
        class184 var12 = class184.method3200(var10.method5246());
        if (var12.field1907) {
            this.field3116.put(new class352(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ld.au(I)V")
    public void method5369() {
        Iterator var1 = this.field3116.values().iterator();
        while (var1.hasNext()) {
            class304 var2 = (class304) var1.next();
            if (var2 instanceof class284) {
                ((class284) var2).method5245();
            }
        }
    }

    @ObfuscatedName("ld.ar(Ljava/util/List;I)V")
    public void method5437(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class292 var3 = (class292) var2.next();
            if (class184.method3200(var3.field3166).field1907 && var3.field3256.field3754 >> 6 == this.field3114 && var3.field3256.field3756 >> 6 == this.field3118) {
                class292 var4 = new class292(var3.field3256, var3.field3256, var3.field3166, this.method5371(var3.field3166));
                this.field3117.add(var4);
            }
        }
    }

    @ObfuscatedName("ld.al(I)V")
    public void method5399() {
        if (this.field3119 != null) {
            this.field3119.method5589();
            return;
        }
        Iterator var1 = this.field3124.iterator();
        while (var1.hasNext()) {
            class289 var2 = (class289) var1.next();
            var2.method5589();
        }
    }

    @ObfuscatedName("ld.ad(Lpo;I)Z")
    public boolean method5372(class391 arg0) {
        this.field3116.clear();
        if (this.field3119 == null) {
            boolean var2 = true;
            Iterator var3 = this.field3124.iterator();
            while (var3.hasNext()) {
                class289 var4 = (class289) var3.next();
                var4.method5570(arg0);
                var2 &= var4.method5569();
            }
            if (var2) {
                Iterator var5 = this.field3124.iterator();
                while (var5.hasNext()) {
                    class289 var6 = (class289) var5.next();
                    this.method5367(var6.method5533() * 8, var6.method5530() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field3119.method5570(arg0);
            if (this.field3119.method5569()) {
                this.method5367(0, 0, 64, 64, this.field3119);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ld.ah(ILlo;[Lvt;Lpo;Lpo;D)V")
    public void method5373(int arg0, class308 arg1, class564[] arg2, class391 arg3, class391 arg4, double arg5) {
        this.field3120 = arg0;
        if (this.field3119 == null && this.field3124.isEmpty()) {
            return;
        }
        int var8 = this.field3114;
        int var9 = this.field3118;
        class315 var10 = field3123;
        long var11 = (long) (arg0 << 16 | var8 << 8 | var9);
        class565 var13 = (class565) var10.method5703(var11);
        if (var13 != null) {
            return;
        }
        if (class240.method4332() != arg5) {
            class240.method4329(arg5);
        }
        boolean var14 = true;
        boolean var15 = var14 & this.method5372(arg3);
        int var16;
        if (this.field3119 == null) {
            var16 = ((class295) this.field3124.getFirst()).field3196;
        } else {
            var16 = this.field3119.field3196;
        }
        boolean var17 = var15 & arg4.method6786(var16);
        if (!var17) {
            return;
        }
        byte[] var18 = arg4.method6788(var16);
        class298 var19 = class298.method1039(var18);
        class565 var20 = new class565(this.field3120 * 64, this.field3120 * 64);
        var20.method9414();
        if (this.field3119 == null) {
            this.method5404(arg1, arg2, var19);
        } else {
            this.method5376(arg1, arg2, var19);
        }
        method5195(var20, this.field3114, this.field3118, this.field3120);
        this.method5399();
    }

    @ObfuscatedName("ld.ap(IIILjava/util/HashSet;I)V")
    public void method5374(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method5366(arg0, arg1, arg3, arg2);
        this.method5390(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ld.ab(Ljava/util/HashSet;IIB)V")
    public void method5413(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3116.values().iterator();
        while (var4.hasNext()) {
            class304 var5 = (class304) var4.next();
            if (var5.method5621()) {
                int var6 = var5.method5246();
                if (arg0.contains(var6)) {
                    class184 var7 = class184.method3200(var6);
                    this.method5386(var7, var5.field3255, var5.field3257, arg1, arg2);
                }
            }
        }
        this.method5385(arg0, arg1, arg2);
    }

    @ObfuscatedName("ld.az(Llo;[Lvt;Llc;I)V")
    public void method5376(class308 arg0, class564[] arg1, class298 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method5379(var4, var5, this.field3119, arg0, arg2);
                this.method5380(var4, var5, this.field3119, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method5378(var6, var7, this.field3119, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ld.aa(Llo;[Lvt;Llc;B)V")
    public void method5404(class308 arg0, class564[] arg1, class298 arg2) {
        Iterator var4 = this.field3124.iterator();
        while (var4.hasNext()) {
            class289 var5 = (class289) var4.next();
            for (int var6 = var5.method5533() * 8; var6 < var5.method5533() * 8 + 8; var6++) {
                for (int var7 = var5.method5530() * 8; var7 < var5.method5530() * 8 + 8; var7++) {
                    this.method5379(var6, var7, var5, arg0, arg2);
                    this.method5380(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field3124.iterator();
        while (var8.hasNext()) {
            class289 var9 = (class289) var8.next();
            for (int var10 = var9.method5533() * 8; var10 < var9.method5533() * 8 + 8; var10++) {
                for (int var11 = var9.method5530() * 8; var11 < var9.method5530() * 8 + 8; var11++) {
                    this.method5378(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ld.ai(IILla;Llo;[Lvt;I)V")
    public void method5378(int arg0, int arg1, class295 arg2, class308 arg3, class564[] arg4) {
        this.method5383(arg0, arg1, arg2);
        this.method5428(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ld.ao(IILla;Llo;Llc;I)V")
    public void method5379(int arg0, int arg1, class295 arg2, class308 arg3, class298 arg4) {
        int var6 = arg2.field3192[0][arg0][arg1] - 1;
        int var7 = arg2.field3199[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class561.method9302(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120, this.field3120, this.field3121);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field3121;
            class212 var10 = (class212) class212.field2289.method5733((long) var7);
            class212 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2290.method6782(4, var7);
                class212 var13 = new class212();
                if (var12 != null) {
                    var13.method3933(new class551(var12), var7);
                }
                var13.method3927();
                class212.field2289.method5735(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2293 >= 0) {
                int var16 = Statics.method3053(var11.field2295, var11.field2298, var11.field2299);
                byte var17 = 96;
                int var18;
                if (var16 == -2) {
                    var18 = 12345678;
                } else if (var16 == -1) {
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 127) {
                        var17 = 127;
                    }
                    int var19 = 127 - var17;
                    var18 = var19;
                } else {
                    int var20 = (var16 & 0x7F) * var17 / 128;
                    if (var20 < 2) {
                        var20 = 2;
                    } else if (var20 > 126) {
                        var20 = 126;
                    }
                    var18 = (var16 & 0xFF80) + var20;
                }
                var15 = class240.field2587[var18] | 0xFF000000;
            } else if (var11.field2291 >= 0) {
                int var22 = class240.field2589.field2905.method4753(var11.field2291);
                byte var23 = 96;
                int var24;
                if (var22 == -2) {
                    var24 = 12345678;
                } else if (var22 == -1) {
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > 127) {
                        var23 = 127;
                    }
                    int var25 = 127 - var23;
                    var24 = var25;
                } else {
                    int var26 = (var22 & 0x7F) * var23 / 128;
                    if (var26 < 2) {
                        var26 = 2;
                    } else if (var26 > 126) {
                        var26 = 126;
                    }
                    var24 = (var22 & 0xFF80) + var26;
                }
                var15 = class240.field2587[var24] | 0xFF000000;
            } else if (var11.field2294 == 16711935) {
                var15 = var9;
            } else {
                int var28 = Statics.method3053(var11.field2288, var11.field2297, var11.field2296);
                byte var29 = 96;
                int var30;
                if (var28 == -2) {
                    var30 = 12345678;
                } else if (var28 == -1) {
                    if (var29 < 0) {
                        var29 = 0;
                    } else if (var29 > 127) {
                        var29 = 127;
                    }
                    int var31 = 127 - var29;
                    var30 = var31;
                } else {
                    int var32 = (var28 & 0x7F) * var29 / 128;
                    if (var32 < 2) {
                        var32 = 2;
                    } else if (var32 > 126) {
                        var32 = 126;
                    }
                    var30 = (var28 & 0xFF80) + var32;
                }
                var15 = class240.field2587[var30] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field3198[0][arg0][arg1] == 0) {
            class561.method9302(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120, this.field3120, var8);
            return;
        }
        int var34 = this.method5381(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class561.method9302(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120, this.field3120, var34);
        } else {
            arg3.method5686(this.field3120 * arg0, this.field3120 * (63 - arg1), var34, var8, this.field3120, this.field3120, arg2.field3198[0][arg0][arg1], arg2.field3201[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ld.as(IILla;Llo;B)V")
    public void method5380(int arg0, int arg1, class295 arg2, class308 arg3) {
        for (int var5 = 1; var5 < arg2.field3195; var5++) {
            int var6 = arg2.field3199[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field3121;
                class212 var8 = (class212) class212.field2289.method5733((long) var6);
                class212 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2290.method6782(4, var6);
                    class212 var11 = new class212();
                    if (var10 != null) {
                        var11.method3933(new class551(var10), var6);
                    }
                    var11.method3927();
                    class212.field2289.method5735(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2293 >= 0) {
                    int var14 = Statics.method3053(var9.field2295, var9.field2298, var9.field2299);
                    byte var15 = 96;
                    int var16;
                    if (var14 == -2) {
                        var16 = 12345678;
                    } else if (var14 == -1) {
                        if (var15 < 0) {
                            var15 = 0;
                        } else if (var15 > 127) {
                            var15 = 127;
                        }
                        int var17 = 127 - var15;
                        var16 = var17;
                    } else {
                        int var18 = (var14 & 0x7F) * var15 / 128;
                        if (var18 < 2) {
                            var18 = 2;
                        } else if (var18 > 126) {
                            var18 = 126;
                        }
                        var16 = (var14 & 0xFF80) + var18;
                    }
                    var13 = class240.field2587[var16] | 0xFF000000;
                } else if (var9.field2291 >= 0) {
                    int var20 = class240.field2589.field2905.method4753(var9.field2291);
                    byte var21 = 96;
                    int var22;
                    if (var20 == -2) {
                        var22 = 12345678;
                    } else if (var20 == -1) {
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var23 = 127 - var21;
                        var22 = var23;
                    } else {
                        int var24 = (var20 & 0x7F) * var21 / 128;
                        if (var24 < 2) {
                            var24 = 2;
                        } else if (var24 > 126) {
                            var24 = 126;
                        }
                        var22 = (var20 & 0xFF80) + var24;
                    }
                    var13 = class240.field2587[var22] | 0xFF000000;
                } else if (var9.field2294 == 16711935) {
                    var13 = var7;
                } else {
                    int var26 = Statics.method3053(var9.field2288, var9.field2297, var9.field2296);
                    byte var27 = 96;
                    int var28;
                    if (var26 == -2) {
                        var28 = 12345678;
                    } else if (var26 == -1) {
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 127) {
                            var27 = 127;
                        }
                        int var29 = 127 - var27;
                        var28 = var29;
                    } else {
                        int var30 = (var26 & 0x7F) * var27 / 128;
                        if (var30 < 2) {
                            var30 = 2;
                        } else if (var30 > 126) {
                            var30 = 126;
                        }
                        var28 = (var26 & 0xFF80) + var30;
                    }
                    var13 = class240.field2587[var28] | 0xFF000000;
                }
                if (arg2.field3198[var5][arg0][arg1] == 0) {
                    class561.method9302(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120, this.field3120, var13);
                } else {
                    arg3.method5686(this.field3120 * arg0, this.field3120 * (63 - arg1), 0, var13, this.field3120, this.field3120, arg2.field3198[var5][arg0][arg1], arg2.field3201[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ld.ay(IILla;Llc;I)I")
    public int method5381(int arg0, int arg1, class295 arg2, class298 arg3) {
        return arg2.field3192[0][arg0][arg1] == 0 ? this.field3121 : arg3.method5609(arg0, arg1);
    }

    @ObfuscatedName("ld.aj(IILla;[Lvt;I)V")
    public void method5428(int arg0, int arg1, class295 arg2, class564[] arg3) {
        for (int var5 = 0; var5 < arg2.field3195; var5++) {
            class297[] var6 = arg2.field3202[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class297[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class297 var9 = var7[var8];
                    int var10 = var9.field3213;
                    boolean var11 = var10 >= class372.field4060.field4063 && var10 <= class372.field4061.field4063;
                    if (var11 || Statics.method3698(var9.field3213)) {
                        class210 var12 = class210.method5152(var9.field3217);
                        if (var12.field2200 != -1) {
                            if (var12.field2200 == 46 || var12.field2200 == 52) {
                                arg3[var12.field2200].method9389(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120 * 2 + 1, this.field3120 * 2 + 1);
                            } else {
                                arg3[var12.field2200].method9389(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120 * 2, this.field3120 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ld.av(IILla;B)V")
    public void method5383(int arg0, int arg1, class295 arg2) {
        for (int var4 = 0; var4 < arg2.field3195; var4++) {
            class297[] var5 = arg2.field3202[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class297[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class297 var8 = var6[var7];
                    if (class372.method2590(var8.field3213)) {
                        class210 var9 = class210.method5152(var8.field3217);
                        int var10 = var9.field2194 == 0 ? -3355444 : -3407872;
                        if (class372.field4051.field4063 == var8.field3213) {
                            this.method5435(arg0, arg1, var8.field3214, var10);
                        }
                        if (class372.field4062.field4063 == var8.field3213) {
                            this.method5435(arg0, arg1, var8.field3214, -3355444);
                            this.method5435(arg0, arg1, var8.field3214 + 1, var10);
                        }
                        if (class372.field4043.field4063 == var8.field3213) {
                            if (var8.field3214 == 0) {
                                class561.method9374(this.field3120 * arg0, this.field3120 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3214 == 1) {
                                class561.method9374(this.field3120 * arg0 + this.field3120 - 1, this.field3120 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3214 == 2) {
                                class561.method9374(this.field3120 * arg0 + this.field3120 - 1, this.field3120 * (63 - arg1) + this.field3120 - 1, 1, var10);
                            }
                            if (var8.field3214 == 3) {
                                class561.method9374(this.field3120 * arg0, this.field3120 * (63 - arg1) + this.field3120 - 1, 1, var10);
                            }
                        }
                        if (class372.field4044.field4063 == var8.field3213) {
                            int var11 = var8.field3214 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field3120; var12++) {
                                    class561.method9374(this.field3120 * arg0 + var12, this.field3120 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field3120; var13++) {
                                    class561.method9374(this.field3120 * arg0 + var13, this.field3120 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ld.aw(IILjava/util/HashSet;IB)V")
    public void method5366(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field3116.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class352 var9 = (class352) var8.getKey();
            int var10 = (int) ((float) var9.field3754 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3756 * var5 - var6);
            class304 var12 = (class304) var8.getValue();
            if (var12 != null && var12.method5621()) {
                var12.field3255 = var10;
                var12.field3257 = var11;
                class184 var13 = class184.method3200(var12.method5246());
                if (!arg2.contains(var13.method3473())) {
                    this.method5387(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ld.an(Ljava/util/HashSet;III)V")
    public void method5385(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3117.iterator();
        while (var4.hasNext()) {
            class304 var5 = (class304) var4.next();
            if (var5.method5621()) {
                class184 var6 = class184.method3200(var5.method5246());
                if (var6 != null && arg0.contains(var6.method3473())) {
                    this.method5386(var6, var5.field3255, var5.field3257, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ld.ak(Lhf;IIIIB)V")
    public void method5386(class184 arg0, int arg1, int arg2, int arg3, int arg4) {
        class565 var6 = arg0.method3467(false);
        if (var6 == null) {
            return;
        }
        var6.method9410(arg1 - var6.field5518 / 2, arg2 - var6.field5511 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class561.method9372(arg1, arg2, 15, 16776960, 128);
            class561.method9372(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ld.bn(Lly;IIFI)V")
    public void method5387(class304 arg0, int arg1, int arg2, float arg3) {
        class184 var5 = class184.method3200(arg0.method5246());
        this.method5452(var5, arg1, arg2);
        this.method5389(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ld.bh(Lhf;III)V")
    public void method5452(class184 arg0, int arg1, int arg2) {
        class565 var4 = arg0.method3467(false);
        if (var4 != null) {
            int var5 = this.method5391(var4, arg0.field1916);
            int var6 = this.method5393(var4, arg0.field1917);
            var4.method9410(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ld.bd(Lly;Lhf;IIFI)V")
    public void method5389(class304 arg0, class184 arg1, int arg2, int arg3, float arg4) {
        class299 var6 = arg0.method5247();
        if (var6 != null && var6.field3226.method5236(arg4)) {
            class435 var7 = (class435) this.field3125.get(var6.field3226);
            var7.method7665(var6.field3221, arg2 - var6.field3222 / 2, arg3, var6.field3222, var6.field3223, 0xFF000000 | arg1.field1905, 0, 1, 0, var7.field4804 / 2);
        }
    }

    @ObfuscatedName("ld.bx(IILjava/util/HashSet;IB)V")
    public void method5390(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field3117.iterator();
        while (var6.hasNext()) {
            class304 var7 = (class304) var6.next();
            if (var7.method5621()) {
                int var8 = var7.field3256.field3754 % 64;
                int var9 = var7.field3256.field3756 % 64;
                var7.field3255 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3257 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method5246())) {
                    this.method5387(var7, var7.field3255, var7.field3257, var5);
                }
            }
        }
    }

    @ObfuscatedName("ld.bf(Lvv;Lhg;I)I")
    public int method5391(class565 arg0, class193 arg1) {
        switch(arg1.field1987) {
            case 1:
                return 0;
            case 2:
                return -arg0.field5518 / 2;
            default:
                return -arg0.field5518;
        }
    }

    @ObfuscatedName("ld.bm(Lvv;Lhq;I)I")
    public int method5393(class565 arg0, class197 arg1) {
        switch(arg1.field2059) {
            case 0:
                return -arg0.field5511 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field5511;
        }
    }

    @ObfuscatedName("pg.bs(Lid;I)Z")
    public static boolean method6991(class210 arg0) {
        if (arg0.field2212 != null) {
            int[] var1 = arg0.field2212;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class210 var4 = class210.method5152(var3);
                if (var4.field2199 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2199 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("ld.bw(IB)Lls;")
    public class299 method5371(int arg0) {
        class184 var2 = class184.method3200(arg0);
        return this.method5394(var2);
    }

    @ObfuscatedName("ld.ba(Lhf;I)Lls;")
    public class299 method5394(class184 arg0) {
        if (arg0.field1900 == null || this.field3125 == null || this.field3125.get(class283.field3078) == null) {
            return null;
        }
        int var2 = arg0.field1906;
        class283[] var3 = class283.method5241();
        int var4 = 0;
        class283 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class283 var5 = var3[var4];
            if (var5.field3080 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class435 var8 = (class435) this.field3125.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method7659(arg0.field1900, 1000000);
        String[] var10 = new String[var9];
        var8.method7657(arg0.field1900, (int[]) null, var10);
        int var11 = var10.length * var8.field4804 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method7656(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class299(arg0.field1900, var12, var11, var6);
    }

    @ObfuscatedName("ld.bj(IIIIIB)Ljava/util/List;")
    public List method5395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field3116.values().iterator();
            while (var7.hasNext()) {
                class304 var8 = (class304) var7.next();
                if (var8.method5621() && var8.method5634(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field3117.iterator();
            while (var9.hasNext()) {
                class304 var10 = (class304) var9.next();
                if (var10.method5621() && var10.method5634(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ld.bp(I)Ljava/util/List;")
    public List method5396() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field3117);
        var1.addAll(this.field3116.values());
        return var1;
    }

    @ObfuscatedName("ld.by(IIIIB)V")
    public void method5435(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class561.method9310(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120, arg3);
        }
        if (var5 == 1) {
            class561.method9374(this.field3120 * arg0, this.field3120 * (63 - arg1), this.field3120, arg3);
        }
        if (var5 == 2) {
            class561.method9310(this.field3120 * arg0 + this.field3120 - 1, this.field3120 * (63 - arg1), this.field3120, arg3);
        }
        if (var5 == 3) {
            class561.method9374(this.field3120 * arg0, this.field3120 * (63 - arg1) + this.field3120 - 1, this.field3120, arg3);
        }
    }
}
