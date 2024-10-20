package deob;

import java.util.ArrayList;

@ObfuscatedName("px")
public class class411 {

    @ObfuscatedName("px.az")
    public int field4534 = Integer.MAX_VALUE;

    @ObfuscatedName("px.av")
    public int field4535 = Integer.MAX_VALUE;

    @ObfuscatedName("px.ak")
    public int field4536 = 0;

    @ObfuscatedName("px.ay")
    public int field4537 = 0;

    @ObfuscatedName("px.as")
    public int field4525 = 0;

    @ObfuscatedName("px.ab")
    public boolean field4539 = true;

    @ObfuscatedName("px.ah")
    public class414 field4530;

    @ObfuscatedName("px.ai")
    public ArrayList field4541 = new ArrayList();

    @ObfuscatedName("px.ac")
    public int field4542 = 0;

    @ObfuscatedName("px.al")
    public int field4529 = 0;

    @ObfuscatedName("px.am(IB)Lpc;")
    public class413 method6950(int arg0) {
        return (class413) this.field4541.get(arg0);
    }

    @ObfuscatedName("px.ap(B)Lpc;")
    public class413 method6951() {
        return this.field4541.size() == 0 ? null : (class413) this.field4541.get(this.field4541.size() - 1);
    }

    @ObfuscatedName("px.af(I)Z")
    public boolean method6952() {
        return this.field4541.size() == 0;
    }

    @ObfuscatedName("px.aj(B)Z")
    public boolean method7065() {
        return this.field4535 > 1;
    }

    @ObfuscatedName("px.aq(B)I")
    public int method7048() {
        return this.field4541.size();
    }

    @ObfuscatedName("px.ar(I)Ljava/lang/String;")
    public String method6955() {
        if (this.method6952()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7048());
        for (int var2 = 0; var2 < this.method7048(); var2++) {
            class413 var3 = this.method6950(var2);
            var1.append(var3.field4546);
        }
        return var1.toString();
    }

    @ObfuscatedName("px.ag(II)V")
    public void method6956(int arg0) {
        if (this.field4530 != null && arg0 < this.field4530.field4556 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4534 != arg0) {
            this.field4534 = arg0;
            this.method6997();
        }
    }

    @ObfuscatedName("px.ao(IB)V")
    public void method6953(int arg0) {
        if (this.field4535 != arg0) {
            this.field4535 = arg0;
            this.method6997();
        }
    }

    @ObfuscatedName("px.ae(II)V")
    public void method6958(int arg0) {
        if (this.field4529 != arg0) {
            this.field4529 = arg0;
            this.method6997();
        }
    }

    @ObfuscatedName("px.aa(Lpw;I)V")
    public void method6957(class414 arg0) {
        if (this.field4530 == arg0) {
            return;
        }
        this.field4530 = arg0;
        if (this.field4530 == null) {
            return;
        }
        if (this.field4525 == 0) {
            this.field4525 = this.field4530.field4556;
        }
        if (!this.method6952()) {
            this.method6997();
        }
    }

    @ObfuscatedName("px.au(II)V")
    public void method7021(int arg0) {
        if (this.field4542 != arg0) {
            this.field4542 = arg0;
            this.method6997();
        }
    }

    @ObfuscatedName("px.an(III)Z")
    public boolean method6981(int arg0, int arg1) {
        if (this.field4536 != arg0 || this.field4537 != arg1) {
            this.field4536 = arg0;
            this.field4537 = arg1;
            this.method6997();
        }
        return true;
    }

    @ObfuscatedName("px.ad(IB)V")
    public void method7082(int arg0) {
        if (this.field4525 != arg0) {
            this.field4525 = arg0;
            this.method6997();
        }
    }

    @ObfuscatedName("px.ax(IIB)Lpo;")
    public class415 method6963(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class415(this, 0, 0);
        } else if (arg0 <= this.field4541.size() && arg1 <= this.field4541.size()) {
            return arg1 < arg0 ? new class415(this, arg1, arg0) : new class415(this, arg0, arg1);
        } else {
            return new class415(this, 0, 0);
        }
    }

    @ObfuscatedName("px.aw(CIII)Lpi;")
    public class412 method6967(char arg0, int arg1, int arg2) {
        return this.method6965(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("px.az(Ljava/lang/String;III)Lpi;")
    public class412 method6965(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4541.size() >= arg2) {
            this.method6985(arg1, arg1);
            return new class412(arg1, true);
        }
        this.field4541.ensureCapacity(this.field4541.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4541.size() < arg2; var5++) {
            class413 var6 = new class413();
            var6.field4546 = arg0.charAt(var5);
            this.field4541.add(var4, var6);
            var4++;
        }
        this.method6985(arg1, var4);
        if (this.field4535 == 0 || this.method6976() <= this.field4535) {
            return new class412(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6969(var4);
            if (this.method6976() <= this.field4535) {
                break;
            }
        }
        return new class412(var4, true);
    }

    @ObfuscatedName("px.av(Ljava/lang/String;IB)Lpi;")
    public class412 method7050(String arg0, int arg1) {
        return this.method6965(arg0, this.field4541.size(), arg1);
    }

    @ObfuscatedName("px.ak(Ljava/lang/String;I)Lpi;")
    public class412 method6982(String arg0) {
        this.method6968();
        return this.method7050(arg0, 0);
    }

    @ObfuscatedName("px.ay(I)V")
    public void method6968() {
        this.field4541.clear();
    }

    @ObfuscatedName("px.as(II)I")
    public int method6969(int arg0) {
        return this.method6993(arg0, arg0 + 1);
    }

    @ObfuscatedName("px.ab(III)I")
    public int method6993(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4541.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method7065() && this.field4542 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class413) this.field4541.get(var4)).field4546;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6985(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("px.ah(IIB)I")
    public int method6971(int arg0, int arg1) {
        if (this.field4530 == null) {
            return 0;
        } else if (this.method7065() && arg0 > this.field4534) {
            return this.field4541.size();
        } else {
            if (!this.field4541.isEmpty()) {
                for (int var3 = 0; var3 < this.field4541.size(); var3++) {
                    class413 var4 = (class413) this.field4541.get(var3);
                    if (arg1 <= var4.field4547 + this.method6975()) {
                        if (arg1 < var4.field4547) {
                            break;
                        }
                        if (arg0 < var4.field4545) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4541.size() && ((class413) this.field4541.get(var3 + 1)).field4547 != var4.field4547) {
                            int var5 = this.method6987((class413) this.field4541.get(var3), false);
                            if (arg0 < var4.field4545 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4547 + this.method6975()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class413 var6 = (class413) this.field4541.get(this.field4541.size() - 1);
                if (arg0 >= var6.field4545 && arg0 <= var6.field4545 + this.method7005() && arg1 >= var6.field4547 && arg1 <= var6.field4547 + this.method6975()) {
                    return this.field4541.size() - 1;
                }
            }
            return this.field4541.size();
        }
    }

    @ObfuscatedName("px.ai(III)I")
    public int method7081(int arg0, int arg1) {
        if (this.field4530 == null || this.method6952() || arg0 > this.field4541.size()) {
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
            class413 var6 = (class413) this.field4541.get(arg0 - 1);
            var4 = var6.field4545 + this.method7040(arg0 - 1);
            var5 = var6.field4547;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4541.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class413 var13 = (class413) this.field4541.get(var12 - 1);
            if (var13.field4547 != var5) {
                var8++;
                var5 = var13.field4547;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4545 + this.method7040(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4541.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("px.ac(I)I")
    public int method6973() {
        if (!this.field4541.isEmpty() && this.method6976() == 1) {
            return this.field4541.isEmpty() ? 0 : ((class413) this.field4541.get(this.field4541.size() - 1)).field4545 + this.method7005();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4541.size() - 1; var3 >= 0; var3--) {
            class413 var4 = (class413) this.field4541.get(var3);
            if (var4.field4547 != var1) {
                int var5 = this.method6987(var4, false) + var4.field4545;
                var2 = Math.max(var5, var2);
                var1 = var4.field4547;
            }
        }
        return var2;
    }

    @ObfuscatedName("px.al(S)I")
    public int method7072() {
        return this.method6952() ? 0 : this.field4530.field4556 + ((class413) this.field4541.get(this.field4541.size() - 1)).field4547;
    }

    @ObfuscatedName("px.at(I)I")
    public int method6975() {
        return this.field4525;
    }

    @ObfuscatedName("px.bj(I)I")
    public int method6976() {
        return this.method7072() / this.field4530.field4556;
    }

    @ObfuscatedName("px.bd(I)I")
    public int method7005() {
        return this.method6952() ? 0 : this.method6987((class413) this.field4541.get(this.field4541.size() - 1), false);
    }

    @ObfuscatedName("px.bg(B)I")
    public int method6978() {
        return this.field4534;
    }

    @ObfuscatedName("px.bt(I)I")
    public int method6979() {
        return this.field4535;
    }

    @ObfuscatedName("px.br(I)I")
    public int method6980() {
        return this.field4542;
    }

    @ObfuscatedName("px.ba(I)I")
    public int method7046() {
        return this.field4529;
    }

    @ObfuscatedName("px.bk(IB)I")
    public int method6970(int arg0) {
        switch(this.field4536) {
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

    @ObfuscatedName("px.bn(II)I")
    public int method6983(int arg0) {
        switch(this.field4537) {
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

    @ObfuscatedName("px.by(I)V")
    public void method6997() {
        this.method6985(0, this.field4541.size());
    }

    @ObfuscatedName("px.bc(III)V")
    public void method6985(int arg0, int arg1) {
        if (this.method6952() || this.field4530 == null) {
            return;
        }
        class502 var3 = this.method7030(arg0, arg1);
        boolean var4 = (Integer) var3.field5042 == 0 && (Integer) var3.field5043 == this.field4541.size();
        int var5 = (Integer) var3.field5042;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class413) this.field4541.get((Integer) var3.field5042)).field4547;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5042; var9 <= (Integer) var3.field5043; var9++) {
            boolean var10 = var9 >= this.field4541.size();
            class413 var11 = (class413) this.field4541.get(var10 ? this.field4541.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6987(var11, false);
            boolean var13 = !var10 && var11.field4546 == '\n';
            boolean var14 = !var10 && this.method7065() && var6 + var12 > this.field4534;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4542 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class413 var19 = (class413) this.field4541.get(var18);
                            var17 += var18 < var15 ? this.method6987(var19, false) : 0;
                            if (var19.field4546 == ' ' || var19.field4546 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6970(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class413 var22 = (class413) this.field4541.get(var21);
                    int var23 = this.method6987(var22, false);
                    var22.field4545 = var20;
                    var22.field4547 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6975();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4537 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6975();
        int var25 = this.method6983(var24);
        for (int var26 = 0; var26 < this.field4541.size(); var26++) {
            class413 var27 = (class413) this.field4541.get(var26);
            var27.field4547 -= var25;
        }
    }

    @ObfuscatedName("px.bx(II)I")
    public int method7040(int arg0) {
        return arg0 < this.field4541.size() ? this.method6987((class413) this.field4541.get(arg0), false) : 0;
    }

    @ObfuscatedName("px.bf(Lpc;ZB)I")
    public int method6987(class413 arg0, boolean arg1) {
        if (arg0.field4546 == '\n') {
            return 0;
        } else if (arg1 || this.field4529 == 0) {
            int var3 = this.field4530.field4566[arg0.field4546];
            if (var3 == 0) {
                return arg0.field4546 == '\t' ? this.field4530.field4566[32] * 3 : this.field4530.field4566[32];
            } else {
                return var3;
            }
        } else {
            return this.field4530.field4566[42];
        }
    }

    @ObfuscatedName("px.bp(III)Ltg;")
    public class502 method7030(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4541.size();
        if (var3 == 0 && var4 == var5) {
            return new class502(0, var5);
        }
        int var6 = this.method6989(var3, false);
        int var7 = this.method6949(var4, false);
        switch(this.field4537) {
            case 0:
                if (this.field4536 == 0) {
                    return new class502(var6, var5);
                }
                int var9 = this.method6989(var3, true);
                return new class502(var9, var5);
            case 1:
                return new class502(0, var5);
            case 2:
                if (this.field4536 == 2) {
                    return new class502(0, var7);
                }
                int var8 = this.method6949(var4, true);
                return new class502(0, var8);
            default:
                return new class502(0, var5);
        }
    }

    @ObfuscatedName("px.bv(IZB)I")
    public int method6989(int arg0, boolean arg1) {
        if (arg0 < this.field4541.size()) {
            int var3 = ((class413) this.field4541.get(arg0)).field4547;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class413) this.field4541.get(var4 - 1)).field4547 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class413) this.field4541.get(var4 - 1)).field4547;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("px.bm(IZI)I")
    public int method6949(int arg0, boolean arg1) {
        if (arg0 < this.field4541.size()) {
            int var3 = ((class413) this.field4541.get(arg0)).field4547;
            for (int var4 = arg0; var4 < this.field4541.size() - 1; var4++) {
                if (((class413) this.field4541.get(var4 + 1)).field4547 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class413) this.field4541.get(var4 + 1)).field4547;
                }
            }
        }
        return this.field4541.size();
    }
}
