package deob;

import java.util.ArrayList;

@ObfuscatedName("pt")
public class class396 {

    @ObfuscatedName("pt.au")
    public int field4468 = Integer.MAX_VALUE;

    @ObfuscatedName("pt.ae")
    public int field4469 = Integer.MAX_VALUE;

    @ObfuscatedName("pt.ab")
    public int field4470 = 0;

    @ObfuscatedName("pt.ad")
    public int field4471 = 0;

    @ObfuscatedName("pt.ao")
    public int field4474 = 0;

    @ObfuscatedName("pt.ac")
    public boolean field4463 = true;

    @ObfuscatedName("pt.ak")
    public class399 field4462;

    @ObfuscatedName("pt.an")
    public ArrayList field4475 = new ArrayList();

    @ObfuscatedName("pt.af")
    public int field4476 = 0;

    @ObfuscatedName("pt.ai")
    public int field4473 = 0;

    @ObfuscatedName("pt.aw(II)Lpz;")
    public class398 method6652(int arg0) {
        return (class398) this.field4475.get(arg0);
    }

    @ObfuscatedName("pt.ay(B)Lpz;")
    public class398 method6653() {
        return this.field4475.size() == 0 ? null : (class398) this.field4475.get(this.field4475.size() - 1);
    }

    @ObfuscatedName("pt.ar(I)Z")
    public boolean method6654() {
        return this.field4475.size() == 0;
    }

    @ObfuscatedName("pt.am(I)Z")
    public boolean method6655() {
        return this.field4469 > 1;
    }

    @ObfuscatedName("pt.as(I)I")
    public int method6656() {
        return this.field4475.size();
    }

    @ObfuscatedName("pt.aj(I)Ljava/lang/String;")
    public String method6708() {
        if (this.method6654()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6656());
        for (int var2 = 0; var2 < this.method6656(); var2++) {
            class398 var3 = this.method6652(var2);
            var1.append(var3.field4481);
        }
        return var1.toString();
    }

    @ObfuscatedName("pt.ag(IB)V")
    public void method6724(int arg0) {
        if (this.field4462 != null && arg0 < this.field4462.field4493 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4468 != arg0) {
            this.field4468 = arg0;
            this.method6768();
        }
    }

    @ObfuscatedName("pt.az(II)V")
    public void method6659(int arg0) {
        if (this.field4469 != arg0) {
            this.field4469 = arg0;
            this.method6768();
        }
    }

    @ObfuscatedName("pt.av(II)V")
    public void method6732(int arg0) {
        if (this.field4473 != arg0) {
            this.field4473 = arg0;
            this.method6768();
        }
    }

    @ObfuscatedName("pt.ap(Lpq;I)V")
    public void method6789(class399 arg0) {
        if (this.field4462 == arg0) {
            return;
        }
        this.field4462 = arg0;
        if (this.field4462 == null) {
            return;
        }
        if (this.field4474 == 0) {
            this.field4474 = this.field4462.field4493;
        }
        if (!this.method6654()) {
            this.method6768();
        }
    }

    @ObfuscatedName("pt.aq(II)V")
    public void method6662(int arg0) {
        if (this.field4476 != arg0) {
            this.field4476 = arg0;
            this.method6768();
        }
    }

    @ObfuscatedName("pt.at(III)Z")
    public boolean method6663(int arg0, int arg1) {
        if (this.field4470 != arg0 || this.field4471 != arg1) {
            this.field4470 = arg0;
            this.field4471 = arg1;
            this.method6768();
        }
        return true;
    }

    @ObfuscatedName("pt.ah(IB)V")
    public void method6657(int arg0) {
        if (this.field4474 != arg0) {
            this.field4474 = arg0;
            this.method6768();
        }
    }

    @ObfuscatedName("pt.ax(III)Lpo;")
    public class400 method6762(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class400(this, 0, 0);
        } else if (arg0 <= this.field4475.size() && arg1 <= this.field4475.size()) {
            return arg1 < arg0 ? new class400(this, arg1, arg0) : new class400(this, arg0, arg1);
        } else {
            return new class400(this, 0, 0);
        }
    }

    @ObfuscatedName("pt.aa(CIII)Lph;")
    public class397 method6666(char arg0, int arg1, int arg2) {
        return this.method6667(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pt.au(Ljava/lang/String;III)Lph;")
    public class397 method6667(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4475.size() >= arg2) {
            this.method6687(arg1, arg1);
            return new class397(arg1, true);
        }
        this.field4475.ensureCapacity(this.field4475.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4475.size() < arg2; var5++) {
            class398 var6 = new class398();
            var6.field4481 = arg0.charAt(var5);
            this.field4475.add(var4, var6);
            var4++;
        }
        this.method6687(arg1, var4);
        if (this.field4469 == 0 || this.method6678() <= this.field4469) {
            return new class397(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6777(var4);
            if (this.method6678() <= this.field4469) {
                break;
            }
        }
        return new class397(var4, true);
    }

    @ObfuscatedName("pt.ae(Ljava/lang/String;IB)Lph;")
    public class397 method6668(String arg0, int arg1) {
        return this.method6667(arg0, this.field4475.size(), arg1);
    }

    @ObfuscatedName("pt.ab(Ljava/lang/String;B)Lph;")
    public class397 method6669(String arg0) {
        this.method6670();
        return this.method6668(arg0, 0);
    }

    @ObfuscatedName("pt.ad(B)V")
    public void method6670() {
        this.field4475.clear();
    }

    @ObfuscatedName("pt.ao(IB)I")
    public int method6777(int arg0) {
        return this.method6672(arg0, arg0 + 1);
    }

    @ObfuscatedName("pt.ac(IIB)I")
    public int method6672(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4475.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6655() && this.field4476 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class398) this.field4475.get(var4)).field4481;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6687(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pt.ak(IIB)I")
    public int method6673(int arg0, int arg1) {
        if (this.field4462 == null) {
            return 0;
        } else if (this.method6655() && arg0 > this.field4468) {
            return this.field4475.size();
        } else {
            if (!this.field4475.isEmpty()) {
                for (int var3 = 0; var3 < this.field4475.size(); var3++) {
                    class398 var4 = (class398) this.field4475.get(var3);
                    if (arg1 <= var4.field4482 + this.method6691()) {
                        if (arg1 < var4.field4482) {
                            break;
                        }
                        if (arg0 < var4.field4480) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4475.size() && ((class398) this.field4475.get(var3 + 1)).field4482 != var4.field4482) {
                            int var5 = this.method6686((class398) this.field4475.get(var3), false);
                            if (arg0 < var4.field4480 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4482 + this.method6691()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class398 var6 = (class398) this.field4475.get(this.field4475.size() - 1);
                if (arg0 >= var6.field4480 && arg0 <= var6.field4480 + this.method6679() && arg1 >= var6.field4482 && arg1 <= var6.field4482 + this.method6691()) {
                    return this.field4475.size() - 1;
                }
            }
            return this.field4475.size();
        }
    }

    @ObfuscatedName("pt.an(III)I")
    public int method6674(int arg0, int arg1) {
        if (this.field4462 == null || this.method6654() || arg0 > this.field4475.size()) {
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
            class398 var6 = (class398) this.field4475.get(arg0 - 1);
            var4 = var6.field4480 + this.method6688(arg0 - 1);
            var5 = var6.field4482;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4475.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class398 var13 = (class398) this.field4475.get(var12 - 1);
            if (var13.field4482 != var5) {
                var8++;
                var5 = var13.field4482;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4480 + this.method6688(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4475.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pt.af(S)I")
    public int method6675() {
        if (!this.field4475.isEmpty() && this.method6678() == 1) {
            return this.field4475.isEmpty() ? 0 : ((class398) this.field4475.get(this.field4475.size() - 1)).field4480 + this.method6679();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4475.size() - 1; var3 >= 0; var3--) {
            class398 var4 = (class398) this.field4475.get(var3);
            if (var4.field4482 != var1) {
                int var5 = this.method6686(var4, false) + var4.field4480;
                var2 = Math.max(var5, var2);
                var1 = var4.field4482;
            }
        }
        return var2;
    }

    @ObfuscatedName("pt.ai(I)I")
    public int method6658() {
        return this.method6654() ? 0 : this.field4462.field4493 + ((class398) this.field4475.get(this.field4475.size() - 1)).field4482;
    }

    @ObfuscatedName("pt.al(B)I")
    public int method6691() {
        return this.field4474;
    }

    @ObfuscatedName("pt.bd(S)I")
    public int method6678() {
        return this.method6658() / this.field4462.field4493;
    }

    @ObfuscatedName("pt.bb(I)I")
    public int method6679() {
        return this.method6654() ? 0 : this.method6686((class398) this.field4475.get(this.field4475.size() - 1), false);
    }

    @ObfuscatedName("pt.bn(I)I")
    public int method6680() {
        return this.field4468;
    }

    @ObfuscatedName("pt.ba(B)I")
    public int method6681() {
        return this.field4469;
    }

    @ObfuscatedName("pt.bf(I)I")
    public int method6720() {
        return this.field4476;
    }

    @ObfuscatedName("pt.bs(I)I")
    public int method6683() {
        return this.field4473;
    }

    @ObfuscatedName("pt.bp(IB)I")
    public int method6684(int arg0) {
        switch(this.field4470) {
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

    @ObfuscatedName("pt.bv(IB)I")
    public int method6685(int arg0) {
        switch(this.field4471) {
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

    @ObfuscatedName("pt.bq(I)V")
    public void method6768() {
        this.method6687(0, this.field4475.size());
    }

    @ObfuscatedName("pt.bo(III)V")
    public void method6687(int arg0, int arg1) {
        if (this.method6654() || this.field4462 == null) {
            return;
        }
        class487 var3 = this.method6690(arg0, arg1);
        boolean var4 = (Integer) var3.field4965 == 0 && (Integer) var3.field4963 == this.field4475.size();
        int var5 = (Integer) var3.field4965;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class398) this.field4475.get((Integer) var3.field4965)).field4482;
        int var8 = 0;
        for (int var9 = (Integer) var3.field4965; var9 <= (Integer) var3.field4963; var9++) {
            boolean var10 = var9 >= this.field4475.size();
            class398 var11 = (class398) this.field4475.get(var10 ? this.field4475.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6686(var11, false);
            boolean var13 = !var10 && var11.field4481 == '\n';
            boolean var14 = !var10 && this.method6655() && var6 + var12 > this.field4468;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4476 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class398 var19 = (class398) this.field4475.get(var18);
                            var17 += var18 < var15 ? this.method6686(var19, false) : 0;
                            if (var19.field4481 == ' ' || var19.field4481 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6684(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class398 var22 = (class398) this.field4475.get(var21);
                    int var23 = this.method6686(var22, false);
                    var22.field4480 = var20;
                    var22.field4482 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6691();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4471 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6691();
        int var25 = this.method6685(var24);
        for (int var26 = 0; var26 < this.field4475.size(); var26++) {
            class398 var27 = (class398) this.field4475.get(var26);
            var27.field4482 -= var25;
        }
    }

    @ObfuscatedName("pt.br(IB)I")
    public int method6688(int arg0) {
        return arg0 < this.field4475.size() ? this.method6686((class398) this.field4475.get(arg0), false) : 0;
    }

    @ObfuscatedName("pt.bw(Lpz;ZB)I")
    public int method6686(class398 arg0, boolean arg1) {
        if (arg0.field4481 == '\n') {
            return 0;
        } else if (arg1 || this.field4473 == 0) {
            int var3 = this.field4462.field4504[arg0.field4481];
            if (var3 == 0) {
                return arg0.field4481 == '\t' ? this.field4462.field4504[32] * 3 : this.field4462.field4504[32];
            } else {
                return var3;
            }
        } else {
            return this.field4462.field4504[42];
        }
    }

    @ObfuscatedName("pt.be(IIB)Lsf;")
    public class487 method6690(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4475.size();
        if (var3 == 0 && var4 == var5) {
            return new class487(0, var5);
        }
        int var6 = this.method6706(var3, false);
        int var7 = this.method6692(var4, false);
        switch(this.field4471) {
            case 0:
                if (this.field4470 == 0) {
                    return new class487(var6, var5);
                }
                int var9 = this.method6706(var3, true);
                return new class487(var9, var5);
            case 1:
                return new class487(0, var5);
            case 2:
                if (this.field4470 == 2) {
                    return new class487(0, var7);
                }
                int var8 = this.method6692(var4, true);
                return new class487(0, var8);
            default:
                return new class487(0, var5);
        }
    }

    @ObfuscatedName("pt.bc(IZI)I")
    public int method6706(int arg0, boolean arg1) {
        if (arg0 < this.field4475.size()) {
            int var3 = ((class398) this.field4475.get(arg0)).field4482;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class398) this.field4475.get(var4 - 1)).field4482 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class398) this.field4475.get(var4 - 1)).field4482;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pt.bi(IZI)I")
    public int method6692(int arg0, boolean arg1) {
        if (arg0 < this.field4475.size()) {
            int var3 = ((class398) this.field4475.get(arg0)).field4482;
            for (int var4 = arg0; var4 < this.field4475.size() - 1; var4++) {
                if (((class398) this.field4475.get(var4 + 1)).field4482 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class398) this.field4475.get(var4 + 1)).field4482;
                }
            }
        }
        return this.field4475.size();
    }
}
