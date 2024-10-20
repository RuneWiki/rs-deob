package deob;

import java.util.ArrayList;

@ObfuscatedName("pj")
public class class395 {

    @ObfuscatedName("pj.ab")
    public int field4460 = Integer.MAX_VALUE;

    @ObfuscatedName("pj.ag")
    public int field4459 = Integer.MAX_VALUE;

    @ObfuscatedName("pj.am")
    public int field4456 = 0;

    @ObfuscatedName("pj.ax")
    public int field4463 = 0;

    @ObfuscatedName("pj.ah")
    public int field4465 = 0;

    @ObfuscatedName("pj.as")
    public boolean field4467 = true;

    @ObfuscatedName("pj.ay")
    public class398 field4466;

    @ObfuscatedName("pj.aj")
    public ArrayList field4453 = new ArrayList();

    @ObfuscatedName("pj.av")
    public int field4468 = 0;

    @ObfuscatedName("pj.aw")
    public int field4469 = 0;

    @ObfuscatedName("pj.au(II)Lpz;")
    public class397 method6717(int arg0) {
        return (class397) this.field4453.get(arg0);
    }

    @ObfuscatedName("pj.ae(I)Lpz;")
    public class397 method6690() {
        return this.field4453.size() == 0 ? null : (class397) this.field4453.get(this.field4453.size() - 1);
    }

    @ObfuscatedName("pj.ao(I)Z")
    public boolean method6785() {
        return this.field4453.size() == 0;
    }

    @ObfuscatedName("pj.at(I)Z")
    public boolean method6815() {
        return this.field4459 > 1;
    }

    @ObfuscatedName("pj.ac(I)I")
    public int method6695() {
        return this.field4453.size();
    }

    @ObfuscatedName("pj.ai(I)Ljava/lang/String;")
    public String method6696() {
        if (this.method6785()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6695());
        for (int var2 = 0; var2 < this.method6695(); var2++) {
            class397 var3 = this.method6717(var2);
            var1.append(var3.field4477);
        }
        return var1.toString();
    }

    @ObfuscatedName("pj.az(IB)V")
    public void method6742(int arg0) {
        if (this.field4466 != null && arg0 < this.field4466.field4484 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4460 != arg0) {
            this.field4460 = arg0;
            this.method6806();
        }
    }

    @ObfuscatedName("pj.ap(II)V")
    public void method6694(int arg0) {
        if (this.field4459 != arg0) {
            this.field4459 = arg0;
            this.method6806();
        }
    }

    @ObfuscatedName("pj.aa(IB)V")
    public void method6699(int arg0) {
        if (this.field4469 != arg0) {
            this.field4469 = arg0;
            this.method6806();
        }
    }

    @ObfuscatedName("pj.af(Lpk;I)V")
    public void method6700(class398 arg0) {
        if (this.field4466 == arg0) {
            return;
        }
        this.field4466 = arg0;
        if (this.field4466 == null) {
            return;
        }
        if (this.field4465 == 0) {
            this.field4465 = this.field4466.field4484;
        }
        if (!this.method6785()) {
            this.method6806();
        }
    }

    @ObfuscatedName("pj.ad(II)V")
    public void method6764(int arg0) {
        if (this.field4468 != arg0) {
            this.field4468 = arg0;
            this.method6806();
        }
    }

    @ObfuscatedName("pj.aq(III)Z")
    public boolean method6702(int arg0, int arg1) {
        if (this.field4456 != arg0 || this.field4463 != arg1) {
            this.field4456 = arg0;
            this.field4463 = arg1;
            this.method6806();
        }
        return true;
    }

    @ObfuscatedName("pj.al(II)V")
    public void method6703(int arg0) {
        if (this.field4465 != arg0) {
            this.field4465 = arg0;
            this.method6806();
        }
    }

    @ObfuscatedName("pj.an(III)Lpl;")
    public class399 method6704(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class399(this, 0, 0);
        } else if (arg0 <= this.field4453.size() && arg1 <= this.field4453.size()) {
            return arg1 < arg0 ? new class399(this, arg1, arg0) : new class399(this, arg0, arg1);
        } else {
            return new class399(this, 0, 0);
        }
    }

    @ObfuscatedName("pj.ar(CIII)Lpu;")
    public class396 method6760(char arg0, int arg1, int arg2) {
        return this.method6706(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pj.ab(Ljava/lang/String;III)Lpu;")
    public class396 method6706(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4453.size() >= arg2) {
            this.method6691(arg1, arg1);
            return new class396(arg1, true);
        }
        this.field4453.ensureCapacity(this.field4453.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4453.size() < arg2; var5++) {
            class397 var6 = new class397();
            var6.field4477 = arg0.charAt(var5);
            this.field4453.add(var4, var6);
            var4++;
        }
        this.method6691(arg1, var4);
        if (this.field4459 == 0 || this.method6755() <= this.field4459) {
            return new class396(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6710(var4);
            if (this.method6755() <= this.field4459) {
                break;
            }
        }
        return new class396(var4, true);
    }

    @ObfuscatedName("pj.ag(Ljava/lang/String;II)Lpu;")
    public class396 method6753(String arg0, int arg1) {
        return this.method6706(arg0, this.field4453.size(), arg1);
    }

    @ObfuscatedName("pj.am(Ljava/lang/String;B)Lpu;")
    public class396 method6772(String arg0) {
        this.method6709();
        return this.method6753(arg0, 0);
    }

    @ObfuscatedName("pj.ax(I)V")
    public void method6709() {
        this.field4453.clear();
    }

    @ObfuscatedName("pj.ah(IB)I")
    public int method6710(int arg0) {
        return this.method6711(arg0, arg0 + 1);
    }

    @ObfuscatedName("pj.as(III)I")
    public int method6711(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4453.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6815() && this.field4468 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class397) this.field4453.get(var4)).field4477;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6691(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pj.ay(IIS)I")
    public int method6741(int arg0, int arg1) {
        if (this.field4466 == null) {
            return 0;
        } else if (this.method6815() && arg0 > this.field4460) {
            return this.field4453.size();
        } else {
            if (!this.field4453.isEmpty()) {
                for (int var3 = 0; var3 < this.field4453.size(); var3++) {
                    class397 var4 = (class397) this.field4453.get(var3);
                    if (arg1 <= var4.field4479 + this.method6716()) {
                        if (arg1 < var4.field4479) {
                            break;
                        }
                        if (arg0 < var4.field4476) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4453.size() && ((class397) this.field4453.get(var3 + 1)).field4479 != var4.field4479) {
                            int var5 = this.method6736((class397) this.field4453.get(var3), false);
                            if (arg0 < var4.field4476 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4479 + this.method6716()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class397 var6 = (class397) this.field4453.get(this.field4453.size() - 1);
                if (arg0 >= var6.field4476 && arg0 <= var6.field4476 + this.method6718() && arg1 >= var6.field4479 && arg1 <= var6.field4479 + this.method6716()) {
                    return this.field4453.size() - 1;
                }
            }
            return this.field4453.size();
        }
    }

    @ObfuscatedName("pj.aj(IIS)I")
    public int method6713(int arg0, int arg1) {
        if (this.field4466 == null || this.method6785() || arg0 > this.field4453.size()) {
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
            class397 var6 = (class397) this.field4453.get(arg0 - 1);
            var4 = var6.field4476 + this.method6727(arg0 - 1);
            var5 = var6.field4479;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4453.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class397 var13 = (class397) this.field4453.get(var12 - 1);
            if (var13.field4479 != var5) {
                var8++;
                var5 = var13.field4479;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4476 + this.method6727(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4453.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pj.av(I)I")
    public int method6714() {
        if (!this.field4453.isEmpty() && this.method6755() == 1) {
            return this.field4453.isEmpty() ? 0 : ((class397) this.field4453.get(this.field4453.size() - 1)).field4476 + this.method6718();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4453.size() - 1; var3 >= 0; var3--) {
            class397 var4 = (class397) this.field4453.get(var3);
            if (var4.field4479 != var1) {
                int var5 = this.method6736(var4, false) + var4.field4476;
                var2 = Math.max(var5, var2);
                var1 = var4.field4479;
            }
        }
        return var2;
    }

    @ObfuscatedName("pj.aw(I)I")
    public int method6715() {
        return this.method6785() ? 0 : this.field4466.field4484 + ((class397) this.field4453.get(this.field4453.size() - 1)).field4479;
    }

    @ObfuscatedName("pj.ak(I)I")
    public int method6716() {
        return this.field4465;
    }

    @ObfuscatedName("pj.bh(B)I")
    public int method6755() {
        return this.method6715() / this.field4466.field4484;
    }

    @ObfuscatedName("pj.bj(I)I")
    public int method6718() {
        return this.method6785() ? 0 : this.method6736((class397) this.field4453.get(this.field4453.size() - 1), false);
    }

    @ObfuscatedName("pj.bk(B)I")
    public int method6817() {
        return this.field4460;
    }

    @ObfuscatedName("pj.bv(I)I")
    public int method6720() {
        return this.field4459;
    }

    @ObfuscatedName("pj.bt(B)I")
    public int method6739() {
        return this.field4468;
    }

    @ObfuscatedName("pj.bd(I)I")
    public int method6722() {
        return this.field4469;
    }

    @ObfuscatedName("pj.by(IB)I")
    public int method6723(int arg0) {
        switch(this.field4456) {
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

    @ObfuscatedName("pj.bs(IB)I")
    public int method6724(int arg0) {
        switch(this.field4463) {
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

    @ObfuscatedName("pj.bm(I)V")
    public void method6806() {
        this.method6691(0, this.field4453.size());
    }

    @ObfuscatedName("pj.bf(III)V")
    public void method6691(int arg0, int arg1) {
        if (this.method6785() || this.field4466 == null) {
            return;
        }
        class486 var3 = this.method6729(arg0, arg1);
        boolean var4 = (Integer) var3.field4967 == 0 && (Integer) var3.field4966 == this.field4453.size();
        int var5 = (Integer) var3.field4967;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class397) this.field4453.get((Integer) var3.field4967)).field4479;
        int var8 = 0;
        for (int var9 = (Integer) var3.field4967; var9 <= (Integer) var3.field4966; var9++) {
            boolean var10 = var9 >= this.field4453.size();
            class397 var11 = (class397) this.field4453.get(var10 ? this.field4453.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6736(var11, false);
            boolean var13 = !var10 && var11.field4477 == '\n';
            boolean var14 = !var10 && this.method6815() && var6 + var12 > this.field4460;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4468 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class397 var19 = (class397) this.field4453.get(var18);
                            var17 += var18 < var15 ? this.method6736(var19, false) : 0;
                            if (var19.field4477 == ' ' || var19.field4477 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6723(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class397 var22 = (class397) this.field4453.get(var21);
                    int var23 = this.method6736(var22, false);
                    var22.field4476 = var20;
                    var22.field4479 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6716();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4463 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6716();
        int var25 = this.method6724(var24);
        for (int var26 = 0; var26 < this.field4453.size(); var26++) {
            class397 var27 = (class397) this.field4453.get(var26);
            var27.field4479 -= var25;
        }
    }

    @ObfuscatedName("pj.bq(II)I")
    public int method6727(int arg0) {
        return arg0 < this.field4453.size() ? this.method6736((class397) this.field4453.get(arg0), false) : 0;
    }

    @ObfuscatedName("pj.ba(Lpz;ZI)I")
    public int method6736(class397 arg0, boolean arg1) {
        if (arg0.field4477 == '\n') {
            return 0;
        } else if (arg1 || this.field4469 == 0) {
            int var3 = this.field4466.field4487[arg0.field4477];
            if (var3 == 0) {
                return arg0.field4477 == '\t' ? this.field4466.field4487[32] * 3 : this.field4466.field4487[32];
            } else {
                return var3;
            }
        } else {
            return this.field4466.field4487[42];
        }
    }

    @ObfuscatedName("pj.bl(IIB)Lss;")
    public class486 method6729(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4453.size();
        if (var3 == 0 && var4 == var5) {
            return new class486(0, var5);
        }
        int var6 = this.method6730(var3, false);
        int var7 = this.method6740(var4, false);
        switch(this.field4463) {
            case 0:
                if (this.field4456 == 0) {
                    return new class486(var6, var5);
                }
                int var9 = this.method6730(var3, true);
                return new class486(var9, var5);
            case 1:
                return new class486(0, var5);
            case 2:
                if (this.field4456 == 2) {
                    return new class486(0, var7);
                }
                int var8 = this.method6740(var4, true);
                return new class486(0, var8);
            default:
                return new class486(0, var5);
        }
    }

    @ObfuscatedName("pj.bp(IZI)I")
    public int method6730(int arg0, boolean arg1) {
        if (arg0 < this.field4453.size()) {
            int var3 = ((class397) this.field4453.get(arg0)).field4479;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class397) this.field4453.get(var4 - 1)).field4479 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class397) this.field4453.get(var4 - 1)).field4479;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pj.bu(IZI)I")
    public int method6740(int arg0, boolean arg1) {
        if (arg0 < this.field4453.size()) {
            int var3 = ((class397) this.field4453.get(arg0)).field4479;
            for (int var4 = arg0; var4 < this.field4453.size() - 1; var4++) {
                if (((class397) this.field4453.get(var4 + 1)).field4479 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class397) this.field4453.get(var4 + 1)).field4479;
                }
            }
        }
        return this.field4453.size();
    }
}
