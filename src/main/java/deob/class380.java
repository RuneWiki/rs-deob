package deob;

import java.util.ArrayList;

@ObfuscatedName("oq")
public class class380 {

    @ObfuscatedName("oq.ah")
    public int field4414 = Integer.MAX_VALUE;

    @ObfuscatedName("oq.av")
    public int field4412 = Integer.MAX_VALUE;

    @ObfuscatedName("oq.ar")
    public int field4413 = 0;

    @ObfuscatedName("oq.am")
    public int field4419 = 0;

    @ObfuscatedName("oq.as")
    public int field4415 = 0;

    @ObfuscatedName("oq.aj")
    public boolean field4416 = true;

    @ObfuscatedName("oq.ak")
    public class383 field4410;

    @ObfuscatedName("oq.az")
    public ArrayList field4418 = new ArrayList();

    @ObfuscatedName("oq.ad")
    public int field4407 = 0;

    @ObfuscatedName("oq.ae")
    public int field4420 = 0;

    @ObfuscatedName("oq.af(II)Lom;")
    public class382 method6618(int arg0) {
        return (class382) this.field4418.get(arg0);
    }

    @ObfuscatedName("oq.an(I)Lom;")
    public class382 method6648() {
        return this.field4418.size() == 0 ? null : (class382) this.field4418.get(this.field4418.size() - 1);
    }

    @ObfuscatedName("oq.aw(I)Z")
    public boolean method6620() {
        return this.field4418.size() == 0;
    }

    @ObfuscatedName("oq.ac(B)Z")
    public boolean method6621() {
        return this.field4412 > 1;
    }

    @ObfuscatedName("oq.au(I)I")
    public int method6622() {
        return this.field4418.size();
    }

    @ObfuscatedName("oq.ab(I)Ljava/lang/String;")
    public String method6623() {
        if (this.method6620()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6622());
        for (int var2 = 0; var2 < this.method6622(); var2++) {
            class382 var3 = this.method6618(var2);
            var1.append(var3.field4429);
        }
        return var1.toString();
    }

    @ObfuscatedName("oq.aq(IB)V")
    public void method6678(int arg0) {
        if (this.field4410 != null && arg0 < this.field4410.field4439 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4414 != arg0) {
            this.field4414 = arg0;
            this.method6652();
        }
    }

    @ObfuscatedName("oq.al(IB)V")
    public void method6619(int arg0) {
        if (this.field4412 != arg0) {
            this.field4412 = arg0;
            this.method6652();
        }
    }

    @ObfuscatedName("oq.at(II)V")
    public void method6656(int arg0) {
        if (this.field4420 != arg0) {
            this.field4420 = arg0;
            this.method6652();
        }
    }

    @ObfuscatedName("oq.aa(Lou;I)V")
    public void method6731(class383 arg0) {
        if (this.field4410 == arg0) {
            return;
        }
        this.field4410 = arg0;
        if (this.field4410 == null) {
            return;
        }
        if (this.field4415 == 0) {
            this.field4415 = this.field4410.field4439;
        }
        if (!this.method6620()) {
            this.method6652();
        }
    }

    @ObfuscatedName("oq.ay(IB)V")
    public void method6628(int arg0) {
        if (this.field4407 != arg0) {
            this.field4407 = arg0;
            this.method6652();
        }
    }

    @ObfuscatedName("oq.ao(III)Z")
    public boolean method6629(int arg0, int arg1) {
        if (this.field4413 != arg0 || this.field4419 != arg1) {
            this.field4413 = arg0;
            this.field4419 = arg1;
            this.method6652();
        }
        return true;
    }

    @ObfuscatedName("oq.ax(IB)V")
    public void method6630(int arg0) {
        if (this.field4415 != arg0) {
            this.field4415 = arg0;
            this.method6652();
        }
    }

    @ObfuscatedName("oq.ai(IIB)Loa;")
    public class384 method6699(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class384(this, 0, 0);
        } else if (arg0 <= this.field4418.size() && arg1 <= this.field4418.size()) {
            return arg1 < arg0 ? new class384(this, arg1, arg0) : new class384(this, arg0, arg1);
        } else {
            return new class384(this, 0, 0);
        }
    }

    @ObfuscatedName("oq.ag(CIII)Low;")
    public class381 method6665(char arg0, int arg1, int arg2) {
        return this.method6633(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("oq.ah(Ljava/lang/String;IIB)Low;")
    public class381 method6633(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4418.size() >= arg2) {
            this.method6653(arg1, arg1);
            return new class381(arg1, true);
        }
        this.field4418.ensureCapacity(this.field4418.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4418.size() < arg2; var5++) {
            class382 var6 = new class382();
            var6.field4429 = arg0.charAt(var5);
            this.field4418.add(var4, var6);
            var4++;
        }
        this.method6653(arg1, var4);
        if (this.field4412 == 0 || this.method6644() <= this.field4412) {
            return new class381(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6637(var4);
            if (this.method6644() <= this.field4412) {
                break;
            }
        }
        return new class381(var4, true);
    }

    @ObfuscatedName("oq.av(Ljava/lang/String;IB)Low;")
    public class381 method6634(String arg0, int arg1) {
        return this.method6633(arg0, this.field4418.size(), arg1);
    }

    @ObfuscatedName("oq.ar(Ljava/lang/String;I)Low;")
    public class381 method6635(String arg0) {
        this.method6627();
        return this.method6634(arg0, 0);
    }

    @ObfuscatedName("oq.am(B)V")
    public void method6627() {
        this.field4418.clear();
    }

    @ObfuscatedName("oq.as(II)I")
    public int method6637(int arg0) {
        return this.method6638(arg0, arg0 + 1);
    }

    @ObfuscatedName("oq.aj(III)I")
    public int method6638(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4418.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6621() && this.field4407 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class382) this.field4418.get(var4)).field4429;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6653(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("oq.ak(IIB)I")
    public int method6639(int arg0, int arg1) {
        if (this.field4410 == null) {
            return 0;
        } else if (this.method6621() && arg0 > this.field4414) {
            return this.field4418.size();
        } else {
            if (!this.field4418.isEmpty()) {
                for (int var3 = 0; var3 < this.field4418.size(); var3++) {
                    class382 var4 = (class382) this.field4418.get(var3);
                    if (arg1 <= var4.field4431 + this.method6744()) {
                        if (arg1 < var4.field4431) {
                            break;
                        }
                        if (arg0 < var4.field4428) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4418.size() && ((class382) this.field4418.get(var3 + 1)).field4431 != var4.field4431) {
                            int var5 = this.method6655((class382) this.field4418.get(var3), false);
                            if (arg0 < var4.field4428 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4431 + this.method6744()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class382 var6 = (class382) this.field4418.get(this.field4418.size() - 1);
                if (arg0 >= var6.field4428 && arg0 <= var6.field4428 + this.method6717() && arg1 >= var6.field4431 && arg1 <= var6.field4431 + this.method6744()) {
                    return this.field4418.size() - 1;
                }
            }
            return this.field4418.size();
        }
    }

    @ObfuscatedName("oq.az(IIB)I")
    public int method6640(int arg0, int arg1) {
        if (this.field4410 == null || this.method6620() || arg0 > this.field4418.size()) {
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
            class382 var6 = (class382) this.field4418.get(arg0 - 1);
            var4 = var6.field4428 + this.method6654(arg0 - 1);
            var5 = var6.field4431;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4418.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class382 var13 = (class382) this.field4418.get(var12 - 1);
            if (var13.field4431 != var5) {
                var8++;
                var5 = var13.field4431;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4428 + this.method6654(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4418.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("oq.ad(I)I")
    public int method6641() {
        if (!this.field4418.isEmpty() && this.method6644() == 1) {
            return this.field4418.isEmpty() ? 0 : ((class382) this.field4418.get(this.field4418.size() - 1)).field4428 + this.method6717();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4418.size() - 1; var3 >= 0; var3--) {
            class382 var4 = (class382) this.field4418.get(var3);
            if (var4.field4431 != var1) {
                int var5 = this.method6655(var4, false) + var4.field4428;
                var2 = Math.max(var5, var2);
                var1 = var4.field4431;
            }
        }
        return var2;
    }

    @ObfuscatedName("oq.ae(I)I")
    public int method6642() {
        return this.method6620() ? 0 : this.field4410.field4439 + ((class382) this.field4418.get(this.field4418.size() - 1)).field4431;
    }

    @ObfuscatedName("oq.ap(I)I")
    public int method6744() {
        return this.field4415;
    }

    @ObfuscatedName("oq.by(B)I")
    public int method6644() {
        return this.method6642() / this.field4410.field4439;
    }

    @ObfuscatedName("oq.bb(B)I")
    public int method6717() {
        return this.method6620() ? 0 : this.method6655((class382) this.field4418.get(this.field4418.size() - 1), false);
    }

    @ObfuscatedName("oq.bi(I)I")
    public int method6737() {
        return this.field4414;
    }

    @ObfuscatedName("oq.be(S)I")
    public int method6647() {
        return this.field4412;
    }

    @ObfuscatedName("oq.bk(I)I")
    public int method6692() {
        return this.field4407;
    }

    @ObfuscatedName("oq.bx(I)I")
    public int method6649() {
        return this.field4420;
    }

    @ObfuscatedName("oq.bo(IB)I")
    public int method6739(int arg0) {
        switch(this.field4413) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                return 0;
        }
    }

    @ObfuscatedName("oq.bz(II)I")
    public int method6741(int arg0) {
        switch(this.field4419) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                return 0;
        }
    }

    @ObfuscatedName("oq.bm(I)V")
    public void method6652() {
        this.method6653(0, this.field4418.size());
    }

    @ObfuscatedName("oq.bd(III)V")
    public void method6653(int arg0, int arg1) {
        if (this.method6620() || this.field4410 == null) {
            return;
        }
        class462 var3 = this.method6617(arg0, arg1);
        boolean var4 = (Integer) var3.field4887 == 0 && (Integer) var3.field4888 == this.field4418.size();
        int var5 = (Integer) var3.field4887;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class382) this.field4418.get((Integer) var3.field4887)).field4431;
        int var8 = 0;
        for (int var9 = (Integer) var3.field4887; var9 <= (Integer) var3.field4888; var9++) {
            boolean var10 = var9 >= this.field4418.size();
            class382 var11 = (class382) this.field4418.get(var10 ? this.field4418.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6655(var11, false);
            boolean var13 = !var10 && var11.field4429 == '\n';
            boolean var14 = !var10 && this.method6621() && var6 + var12 > this.field4414;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4407 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class382 var19 = (class382) this.field4418.get(var18);
                            var17 += var18 < var15 ? this.method6655(var19, false) : 0;
                            if (var19.field4429 == ' ' || var19.field4429 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6739(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class382 var22 = (class382) this.field4418.get(var21);
                    int var23 = this.method6655(var22, false);
                    var22.field4428 = var20;
                    var22.field4431 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6744();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4419 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6744();
        int var25 = this.method6741(var24);
        for (int var26 = 0; var26 < this.field4418.size(); var26++) {
            class382 var27 = (class382) this.field4418.get(var26);
            var27.field4431 -= var25;
        }
    }

    @ObfuscatedName("oq.bt(II)I")
    public int method6654(int arg0) {
        return arg0 < this.field4418.size() ? this.method6655((class382) this.field4418.get(arg0), false) : 0;
    }

    @ObfuscatedName("oq.bj(Lom;ZI)I")
    public int method6655(class382 arg0, boolean arg1) {
        if (arg0.field4429 == '\n') {
            return 0;
        } else if (arg1 || this.field4420 == 0) {
            int var3 = this.field4410.field4434[arg0.field4429];
            if (var3 == 0) {
                return arg0.field4429 == '\t' ? this.field4410.field4434[32] * 3 : this.field4410.field4434[32];
            } else {
                return var3;
            }
        } else {
            return this.field4410.field4434[42];
        }
    }

    @ObfuscatedName("oq.bn(III)Lrg;")
    public class462 method6617(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4418.size();
        if (var3 == 0 && var4 == var5) {
            return new class462(0, var5);
        }
        int var6 = this.method6657(var3, false);
        int var7 = this.method6658(var4, false);
        switch(this.field4419) {
            case 0:
                if (this.field4413 == 0) {
                    return new class462(var6, var5);
                }
                int var9 = this.method6657(var3, true);
                return new class462(var9, var5);
            case 1:
                return new class462(0, var5);
            case 2:
                if (this.field4413 == 2) {
                    return new class462(0, var7);
                }
                int var8 = this.method6658(var4, true);
                return new class462(0, var8);
            default:
                return new class462(0, var5);
        }
    }

    @ObfuscatedName("oq.bs(IZI)I")
    public int method6657(int arg0, boolean arg1) {
        if (arg0 < this.field4418.size()) {
            int var3 = ((class382) this.field4418.get(arg0)).field4431;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class382) this.field4418.get(var4 - 1)).field4431 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class382) this.field4418.get(var4 - 1)).field4431;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("oq.br(IZI)I")
    public int method6658(int arg0, boolean arg1) {
        if (arg0 < this.field4418.size()) {
            int var3 = ((class382) this.field4418.get(arg0)).field4431;
            for (int var4 = arg0; var4 < this.field4418.size() - 1; var4++) {
                if (((class382) this.field4418.get(var4 + 1)).field4431 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class382) this.field4418.get(var4 + 1)).field4431;
                }
            }
        }
        return this.field4418.size();
    }
}
