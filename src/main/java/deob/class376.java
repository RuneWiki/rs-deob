package deob;

import java.util.ArrayList;

@ObfuscatedName("ow")
public class class376 {

    @ObfuscatedName("ow.az")
    public int field4367 = Integer.MAX_VALUE;

    @ObfuscatedName("ow.ae")
    public int field4364 = Integer.MAX_VALUE;

    @ObfuscatedName("ow.au")
    public int field4369 = 0;

    @ObfuscatedName("ow.ag")
    public int field4370 = 0;

    @ObfuscatedName("ow.at")
    public int field4375 = 0;

    @ObfuscatedName("ow.af")
    public boolean field4372 = true;

    @ObfuscatedName("ow.ai")
    public class379 field4373;

    @ObfuscatedName("ow.aw")
    public ArrayList field4374 = new ArrayList();

    @ObfuscatedName("ow.aa")
    public int field4368 = 0;

    @ObfuscatedName("ow.ah")
    public int field4376 = 0;

    @ObfuscatedName("ow.aj(IB)Lod;")
    public class378 method6525(int arg0) {
        return (class378) this.field4374.get(arg0);
    }

    @ObfuscatedName("ow.al(I)Lod;")
    public class378 method6402() {
        return this.field4374.size() == 0 ? null : (class378) this.field4374.get(this.field4374.size() - 1);
    }

    @ObfuscatedName("ow.ac(I)Z")
    public boolean method6403() {
        return this.field4374.size() == 0;
    }

    @ObfuscatedName("ow.ab(I)Z")
    public boolean method6509() {
        return this.field4364 > 1;
    }

    @ObfuscatedName("ow.an(I)I")
    public int method6405() {
        return this.field4374.size();
    }

    @ObfuscatedName("ow.ao(I)Ljava/lang/String;")
    public String method6406() {
        if (this.method6403()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6405());
        for (int var2 = 0; var2 < this.method6405(); var2++) {
            class378 var3 = this.method6525(var2);
            var1.append(var3.field4381);
        }
        return var1.toString();
    }

    @ObfuscatedName("ow.av(IB)V")
    public void method6407(int arg0) {
        if (this.field4373 != null && arg0 < this.field4373.field4389 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4367 != arg0) {
            this.field4367 = arg0;
            this.method6435();
        }
    }

    @ObfuscatedName("ow.aq(IB)V")
    public void method6408(int arg0) {
        if (this.field4364 != arg0) {
            this.field4364 = arg0;
            this.method6435();
        }
    }

    @ObfuscatedName("ow.ap(II)V")
    public void method6409(int arg0) {
        if (this.field4376 != arg0) {
            this.field4376 = arg0;
            this.method6435();
        }
    }

    @ObfuscatedName("ow.ar(Lou;I)V")
    public void method6410(class379 arg0) {
        if (this.field4373 == arg0) {
            return;
        }
        this.field4373 = arg0;
        if (this.field4373 == null) {
            return;
        }
        if (this.field4375 == 0) {
            this.field4375 = this.field4373.field4389;
        }
        if (!this.method6403()) {
            this.method6435();
        }
    }

    @ObfuscatedName("ow.ak(II)V")
    public void method6534(int arg0) {
        if (this.field4368 != arg0) {
            this.field4368 = arg0;
            this.method6435();
        }
    }

    @ObfuscatedName("ow.ax(III)Z")
    public boolean method6412(int arg0, int arg1) {
        if (this.field4369 != arg0 || this.field4370 != arg1) {
            this.field4369 = arg0;
            this.field4370 = arg1;
            this.method6435();
        }
        return true;
    }

    @ObfuscatedName("ow.as(IB)V")
    public void method6413(int arg0) {
        if (this.field4375 != arg0) {
            this.field4375 = arg0;
            this.method6435();
        }
    }

    @ObfuscatedName("ow.ay(III)Lon;")
    public class380 method6414(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class380(this, 0, 0);
        } else if (arg0 <= this.field4374.size() && arg1 <= this.field4374.size()) {
            return arg1 < arg0 ? new class380(this, arg1, arg0) : new class380(this, arg0, arg1);
        } else {
            return new class380(this, 0, 0);
        }
    }

    @ObfuscatedName("ow.am(CIIB)Loj;")
    public class377 method6477(char arg0, int arg1, int arg2) {
        return this.method6430(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("ow.az(Ljava/lang/String;III)Loj;")
    public class377 method6430(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4374.size() >= arg2) {
            this.method6436(arg1, arg1);
            return new class377(arg1, true);
        }
        this.field4374.ensureCapacity(this.field4374.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4374.size() < arg2; var5++) {
            class378 var6 = new class378();
            var6.field4381 = arg0.charAt(var5);
            this.field4374.add(var4, var6);
            var4++;
        }
        this.method6436(arg1, var4);
        if (this.field4364 == 0 || this.method6427() <= this.field4364) {
            return new class377(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6420(var4);
            if (this.method6427() <= this.field4364) {
                break;
            }
        }
        return new class377(var4, true);
    }

    @ObfuscatedName("ow.ae(Ljava/lang/String;II)Loj;")
    public class377 method6478(String arg0, int arg1) {
        return this.method6430(arg0, this.field4374.size(), arg1);
    }

    @ObfuscatedName("ow.au(Ljava/lang/String;S)Loj;")
    public class377 method6418(String arg0) {
        this.method6419();
        return this.method6478(arg0, 0);
    }

    @ObfuscatedName("ow.ag(B)V")
    public void method6419() {
        this.field4374.clear();
    }

    @ObfuscatedName("ow.at(II)I")
    public int method6420(int arg0) {
        return this.method6438(arg0, arg0 + 1);
    }

    @ObfuscatedName("ow.af(III)I")
    public int method6438(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4374.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6509() && this.field4368 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class378) this.field4374.get(var4)).field4381;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6436(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("ow.ai(III)I")
    public int method6422(int arg0, int arg1) {
        if (this.field4373 == null) {
            return 0;
        } else if (this.method6509() && arg0 > this.field4367) {
            return this.field4374.size();
        } else {
            if (!this.field4374.isEmpty()) {
                for (int var3 = 0; var3 < this.field4374.size(); var3++) {
                    class378 var4 = (class378) this.field4374.get(var3);
                    if (arg1 <= var4.field4379 + this.method6426()) {
                        if (arg1 < var4.field4379) {
                            break;
                        }
                        if (arg0 < var4.field4380) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4374.size() && ((class378) this.field4374.get(var3 + 1)).field4379 != var4.field4379) {
                            int var5 = this.method6460((class378) this.field4374.get(var3), false);
                            if (arg0 < var4.field4380 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4379 + this.method6426()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class378 var6 = (class378) this.field4374.get(this.field4374.size() - 1);
                if (arg0 >= var6.field4380 && arg0 <= var6.field4380 + this.method6428() && arg1 >= var6.field4379 && arg1 <= var6.field4379 + this.method6426()) {
                    return this.field4374.size() - 1;
                }
            }
            return this.field4374.size();
        }
    }

    @ObfuscatedName("ow.aw(IIB)I")
    public int method6423(int arg0, int arg1) {
        if (this.field4373 == null || this.method6403() || arg0 > this.field4374.size()) {
            return 0;
        }
        byte var3;
        if (arg1 > 0) {
            var3 = 1;
        } else {
            var3 = -1;
            arg1 = -arg1;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 > 0) {
            class378 var6 = (class378) this.field4374.get(arg0 - 1);
            var4 = var6.field4380 + this.method6437(arg0 - 1);
            var5 = var6.field4379;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4374.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class378 var13 = (class378) this.field4374.get(var12 - 1);
            if (var13.field4379 != var5) {
                var8++;
                var5 = var13.field4379;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4380 + this.method6437(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4374.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("ow.aa(B)I")
    public int method6424() {
        if (!this.field4374.isEmpty() && this.method6427() == 1) {
            return this.field4374.isEmpty() ? 0 : ((class378) this.field4374.get(this.field4374.size() - 1)).field4380 + this.method6428();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4374.size() - 1; var3 >= 0; var3--) {
            class378 var4 = (class378) this.field4374.get(var3);
            if (var4.field4379 != var1) {
                int var5 = this.method6460(var4, false) + var4.field4380;
                var2 = Math.max(var5, var2);
                var1 = var4.field4379;
            }
        }
        return var2;
    }

    @ObfuscatedName("ow.ah(I)I")
    public int method6425() {
        return this.method6403() ? 0 : this.field4373.field4389 + ((class378) this.field4374.get(this.field4374.size() - 1)).field4379;
    }

    @ObfuscatedName("ow.ad(I)I")
    public int method6426() {
        return this.field4375;
    }

    @ObfuscatedName("ow.bm(I)I")
    public int method6427() {
        return this.method6425() / this.field4373.field4389;
    }

    @ObfuscatedName("ow.bv(I)I")
    public int method6428() {
        return this.method6403() ? 0 : this.method6460((class378) this.field4374.get(this.field4374.size() - 1), false);
    }

    @ObfuscatedName("ow.bo(I)I")
    public int method6429() {
        return this.field4367;
    }

    @ObfuscatedName("ow.bs(I)I")
    public int method6464() {
        return this.field4364;
    }

    @ObfuscatedName("ow.bg(I)I")
    public int method6431() {
        return this.field4368;
    }

    @ObfuscatedName("ow.bh(I)I")
    public int method6513() {
        return this.field4376;
    }

    @ObfuscatedName("ow.bl(II)I")
    public int method6476(int arg0) {
        switch(this.field4369) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                System.out.println("TextRun.getLeftOffsetForHorizontalAlignment: Invalid horizontal alignment. Value: '" + this.field4369 + "'.");
                return 0;
        }
    }

    @ObfuscatedName("ow.bk(II)I")
    public int method6440(int arg0) {
        switch(this.field4370) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                System.out.println("TextRun.getTopOffsetForVerticalAlignment: Invalid vertical alignment. Value: '" + this.field4370 + "'.");
                return 0;
        }
    }

    @ObfuscatedName("ow.br(I)V")
    public void method6435() {
        this.method6436(0, this.field4374.size());
    }

    @ObfuscatedName("ow.ba(IIB)V")
    public void method6436(int arg0, int arg1) {
        if (this.method6403() || this.field4373 == null) {
            return;
        }
        class452 var3 = this.method6415(arg0, arg1);
        boolean var4 = (Integer) var3.field4799 == 0 && (Integer) var3.field4800 == this.field4374.size();
        int var5 = (Integer) var3.field4799;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class378) this.field4374.get((Integer) var3.field4799)).field4379;
        int var8 = 0;
        for (int var9 = (Integer) var3.field4799; var9 <= (Integer) var3.field4800; var9++) {
            boolean var10 = var9 >= this.field4374.size();
            class378 var11 = (class378) this.field4374.get(var10 ? this.field4374.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6460(var11, false);
            boolean var13 = !var10 && var11.field4381 == '\n';
            boolean var14 = !var10 && this.method6509() && var6 + var12 > this.field4367;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4368 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class378 var19 = (class378) this.field4374.get(var18);
                            var17 += var18 < var15 ? this.method6460(var19, false) : 0;
                            if (var19.field4381 == ' ' || var19.field4381 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6476(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class378 var22 = (class378) this.field4374.get(var21);
                    int var23 = this.method6460(var22, false);
                    var22.field4380 = var20;
                    var22.field4379 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6426();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4370 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6426();
        int var25 = this.method6440(var24);
        for (int var26 = 0; var26 < this.field4374.size(); var26++) {
            class378 var27 = (class378) this.field4374.get(var26);
            var27.field4379 -= var25;
        }
    }

    @ObfuscatedName("ow.bz(II)I")
    public int method6437(int arg0) {
        return arg0 < this.field4374.size() ? this.method6460((class378) this.field4374.get(arg0), false) : 0;
    }

    @ObfuscatedName("ow.bq(Lod;ZI)I")
    public int method6460(class378 arg0, boolean arg1) {
        if (arg0.field4381 == '\n') {
            return 0;
        } else if (arg1 || this.field4376 == 0) {
            int var3 = this.field4373.field4384[arg0.field4381];
            if (var3 == 0) {
                return arg0.field4381 == '\t' ? this.field4373.field4384[32] * 3 : this.field4373.field4384[32];
            } else {
                return var3;
            }
        } else {
            return this.field4373.field4384[42];
        }
    }

    @ObfuscatedName("ow.bc(IIB)Lrv;")
    public class452 method6415(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4374.size();
        if (var3 == 0 && var4 == var5) {
            return new class452(0, var5);
        }
        int var6 = this.method6462(var3, false);
        int var7 = this.method6441(var4, false);
        switch(this.field4370) {
            case 0:
                if (this.field4369 == 0) {
                    return new class452(var6, var5);
                }
                int var9 = this.method6462(var3, true);
                return new class452(var9, var5);
            case 1:
                return new class452(0, var5);
            case 2:
                if (this.field4369 == 2) {
                    return new class452(0, var7);
                }
                int var8 = this.method6441(var4, true);
                return new class452(0, var8);
            default:
                return new class452(0, var5);
        }
    }

    @ObfuscatedName("ow.bt(IZI)I")
    public int method6462(int arg0, boolean arg1) {
        if (arg0 < this.field4374.size()) {
            int var3 = ((class378) this.field4374.get(arg0)).field4379;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class378) this.field4374.get(var4 - 1)).field4379 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class378) this.field4374.get(var4 - 1)).field4379;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("ow.be(IZI)I")
    public int method6441(int arg0, boolean arg1) {
        if (arg0 < this.field4374.size()) {
            int var3 = ((class378) this.field4374.get(arg0)).field4379;
            for (int var4 = arg0; var4 < this.field4374.size() - 1; var4++) {
                if (((class378) this.field4374.get(var4 + 1)).field4379 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class378) this.field4374.get(var4 + 1)).field4379;
                }
            }
        }
        return this.field4374.size();
    }
}
