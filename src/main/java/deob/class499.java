package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tc")
public class class499 {

    @ObfuscatedName("tc.ag")
    public class375 field4986;

    @ObfuscatedName("tc.ao")
    public class375 field4969;

    @ObfuscatedName("tc.ae")
    public class375 field4970;

    @ObfuscatedName("tc.aa")
    public static final class501 field5026 = class501.field5033;

    @ObfuscatedName("tc.au")
    public static final class501 field4972 = class501.field5030;

    @ObfuscatedName("tc.an")
    public static final class501 field4973 = class501.field5039;

    @ObfuscatedName("tc.ad")
    public class410 field4974;

    @ObfuscatedName("tc.ax")
    public HashMap field4975;

    @ObfuscatedName("tc.aw")
    public class544[] field5020;

    @ObfuscatedName("tc.az")
    public HashMap field4977;

    @ObfuscatedName("tc.av")
    public class240 field4978;

    @ObfuscatedName("tc.ak")
    public class240 field4979;

    @ObfuscatedName("tc.ay")
    public class240 field4996;

    @ObfuscatedName("tc.as")
    public class242 field4981;

    @ObfuscatedName("tc.ab")
    public class498 field4982;

    @ObfuscatedName("tc.ah")
    public int field4983;

    @ObfuscatedName("tc.ai")
    public int field4984;

    @ObfuscatedName("tc.ac")
    public int field4985 = -1;

    @ObfuscatedName("tc.al")
    public int field4995 = -1;

    @ObfuscatedName("tc.at")
    public float field4976;

    @ObfuscatedName("tc.bj")
    public float field5010;

    @ObfuscatedName("tc.bd")
    public int field4989 = -1;

    @ObfuscatedName("tc.bg")
    public int field4971 = -1;

    @ObfuscatedName("tc.bt")
    public int field5003 = -1;

    @ObfuscatedName("tc.br")
    public int field4992 = -1;

    @ObfuscatedName("tc.ba")
    public int field4993 = 3;

    @ObfuscatedName("tc.bk")
    public int field4994 = 50;

    @ObfuscatedName("tc.bn")
    public boolean field5022 = false;

    @ObfuscatedName("tc.by")
    public HashSet field5014 = null;

    @ObfuscatedName("tc.bc")
    public int field4997 = -1;

    @ObfuscatedName("tc.bx")
    public int field5021 = -1;

    @ObfuscatedName("tc.bf")
    public int field4999 = -1;

    @ObfuscatedName("tc.bp")
    public int field5000 = -1;

    @ObfuscatedName("tc.bv")
    public int field5001 = -1;

    @ObfuscatedName("tc.bm")
    public int field5002 = -1;

    @ObfuscatedName("tc.bq")
    public long field5019;

    @ObfuscatedName("tc.bb")
    public int field4963;

    @ObfuscatedName("tc.bh")
    public int field5005;

    @ObfuscatedName("tc.bw")
    public boolean field5006 = true;

    @ObfuscatedName("tc.be")
    public HashSet field4990 = new HashSet();

    @ObfuscatedName("tc.bs")
    public HashSet field5009 = new HashSet();

    @ObfuscatedName("tc.bl")
    public HashSet field4968 = new HashSet();

    @ObfuscatedName("tc.bz")
    public HashSet field5011 = new HashSet();

    @ObfuscatedName("tc.bo")
    public boolean field5016 = false;

    @ObfuscatedName("tc.cg")
    public int field5013 = 0;

    @ObfuscatedName("tc.ci")
    public final int[] field5012 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tc.cv")
    public List field5015;

    @ObfuscatedName("tc.ct")
    public Iterator field4998;

    @ObfuscatedName("tc.cp")
    public HashSet field5017 = new HashSet();

    @ObfuscatedName("tc.cq")
    public class337 field5018 = null;

    @ObfuscatedName("tc.cl")
    public boolean field4991 = false;

    @ObfuscatedName("tc.cs")
    public class545 field5004;

    @ObfuscatedName("tc.cc")
    public int field4980;

    @ObfuscatedName("tc.cd")
    public int field4988 = -1;

    @ObfuscatedName("tc.cu")
    public int field5023 = -1;

    @ObfuscatedName("tc.co")
    public int field5024 = -1;

    @ObfuscatedName("tc.am(Low;Low;Low;Lpv;Ljava/util/HashMap;[Lut;B)V")
    public void method8060(class375 arg0, class375 arg1, class375 arg2, class410 arg3, HashMap arg4, class544[] arg5) {
        this.field5020 = arg5;
        this.field4986 = arg0;
        this.field4969 = arg1;
        this.field4970 = arg2;
        this.field4974 = arg3;
        this.field4975 = new HashMap();
        this.field4975.put(class237.field2484, arg4.get(field5026));
        this.field4975.put(class237.field2482, arg4.get(field4972));
        this.field4975.put(class237.field2483, arg4.get(field4973));
        this.field4982 = new class498(arg0);
        int var7 = this.field4986.method6412(class259.field2670.field2676);
        int[] var8 = this.field4986.method6405(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4977 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class531 var11 = new class531(this.field4986.method6396(var7, var8[var10]));
            class240 var12 = new class240();
            var12.method4265(var11, var8[var10]);
            this.field4977.put(var12.method4274(), var12);
            if (var12.method4273()) {
                this.field4978 = var12;
            }
        }
        this.method8074(this.field4978);
        this.field4996 = null;
    }

    @ObfuscatedName("tc.ap(B)V")
    public void method8061() {
        class241.field2535.method5366(5);
    }

    @ObfuscatedName("tc.af(IIZIIIIB)V")
    public void method8064(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4982.method8049()) {
            return;
        }
        this.method8065();
        this.method8066();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4976));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4976));
        List var10 = this.field4981.method4471(this.field4983 - var8 / 2 - 1, this.field4984 - var9 / 2 - 1, var8 / 2 + this.field4983 + 1, var9 / 2 + this.field4984 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class258 var13 = (class258) var12.next();
            var11.add(var13);
            class88 var14 = new class88();
            class263 var15 = new class263(var13.method4226(), var13.field2668, var13.field2664);
            var14.method2269(new Object[] { var15, arg0, arg1 });
            if (this.field5017.contains(var13)) {
                var14.method2266(17);
            } else {
                var14.method2266(15);
            }
            class71.method4538(var14);
        }
        Iterator var16 = this.field5017.iterator();
        while (var16.hasNext()) {
            class258 var17 = (class258) var16.next();
            if (!var11.contains(var17)) {
                class88 var18 = new class88();
                class263 var19 = new class263(var17.method4226(), var17.field2668, var17.field2664);
                var18.method2269(new Object[] { var19, arg0, arg1 });
                var18.method2266(16);
                class71.method4538(var18);
            }
        }
        this.field5017 = var11;
    }

    @ObfuscatedName("tc.aj(IIZZI)V")
    public void method8063(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method2852();
        this.method8174(arg0, arg1, arg3, var5);
        if (this.method8069() || !(arg3 || arg2) || client.method2068()) {
            this.method8211();
        } else {
            if (arg3) {
                this.field5001 = arg0;
                this.field5002 = arg1;
                this.field4999 = this.field4983;
                this.field5000 = this.field4984;
            }
            if (this.field4999 != -1) {
                int var7 = arg0 - this.field5001;
                int var8 = arg1 - this.field5002;
                this.method8067(this.field4999 - (int) ((float) var7 / this.field5010), this.field5000 + (int) ((float) var8 / this.field5010), false);
            }
        }
        if (arg3) {
            this.field5019 = var5;
            this.field4963 = arg0;
            this.field5005 = arg1;
        }
    }

    @ObfuscatedName("tc.aq(IIZJ)V")
    public void method8174(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4979 == null) {
            this.field5018 = null;
            return;
        }
        int var6 = (int) ((float) this.field4983 + ((float) (arg0 - this.field5003) - (float) this.method8096() * this.field4976 / 2.0F) / this.field4976);
        int var7 = (int) ((float) this.field4984 - ((float) (arg1 - this.field4992) - (float) this.method8183() * this.field4976 / 2.0F) / this.field4976);
        this.field5018 = this.field4979.method4319(var6 + this.field4979.method4279() * 64, var7 + this.field4979.method4281() * 64);
        if (this.field5018 == null || !arg2) {
            return;
        }
        class227 var8 = client.method853();
        if (client.method728() && var8.method4053(82) && var8.method4053(81)) {
            int var9 = this.field5018.field3604;
            int var10 = this.field5018.field3603;
            int var11 = this.field5018.field3605;
            class311 var12 = class311.method7979(class309.field3214, client.field561.field1404);
            var12.field3279.method8613(0);
            var12.field3279.method8731(var9);
            var12.field3279.method8699(var11);
            var12.field3279.method8737(var10);
            client.field561.method2736(var12);
            return;
        }
        boolean var13 = true;
        if (this.field5006) {
            int var14 = arg0 - this.field4963;
            int var15 = arg1 - this.field5005;
            if (arg3 - this.field5019 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class311 var16 = class311.method7979(class309.field3238, client.field561.field1404);
            var16.field3279.method8668(this.field5018.method5721());
            client.field561.method2736(var16);
            this.field5019 = 0L;
        }
    }

    @ObfuscatedName("tc.ar(B)V")
    public void method8065() {
        if (Statics.field3600 != null) {
            this.field4976 = this.field5010;
            return;
        }
        if (this.field4976 < this.field5010) {
            this.field4976 = Math.min(this.field5010, this.field4976 / 30.0F + this.field4976);
        }
        if (this.field4976 > this.field5010) {
            this.field4976 = Math.max(this.field5010, this.field4976 - this.field4976 / 30.0F);
        }
    }

    @ObfuscatedName("tc.ag(I)V")
    public void method8066() {
        if (!this.method8069()) {
            return;
        }
        int var1 = this.field4985 - this.field4983;
        int var2 = this.field4995 - this.field4984;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8067(this.field4983 + var1, this.field4984 + var2, true);
        if (this.field4985 == this.field4983 && this.field4995 == this.field4984) {
            this.field4985 = -1;
            this.field4995 = -1;
        }
    }

    @ObfuscatedName("tc.ao(IIZI)V")
    public final void method8067(int arg0, int arg1, boolean arg2) {
        this.field4983 = arg0;
        this.field4984 = arg1;
        Statics.method2852();
        if (arg2) {
            this.method8211();
        }
    }

    @ObfuscatedName("tc.ae(B)V")
    public final void method8211() {
        this.field5002 = -1;
        this.field5001 = -1;
        this.field5000 = -1;
        this.field4999 = -1;
    }

    @ObfuscatedName("tc.aa(I)Z")
    public boolean method8069() {
        return this.field4985 != -1 && this.field4995 != -1;
    }

    @ObfuscatedName("tc.au(IIII)Ljr;")
    public class240 method8091(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4977.values().iterator();
        class240 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class240) var4.next();
        } while (!var5.method4267(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tc.an(IIIZB)V")
    public void method8226(int arg0, int arg1, int arg2, boolean arg3) {
        class240 var5 = this.method8091(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4978;
        }
        boolean var6 = false;
        if (this.field4996 != var5 || arg3) {
            this.field4996 = var5;
            this.method8074(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8077(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tc.ad(II)V")
    public void method8071(int arg0) {
        class240 var2 = this.method8195(arg0);
        if (var2 != null) {
            this.method8074(var2);
        }
    }

    @ObfuscatedName("tc.ax(I)I")
    public int method8108() {
        return this.field4979 == null ? -1 : this.field4979.method4272();
    }

    @ObfuscatedName("tc.aw(B)Ljr;")
    public class240 method8073() {
        return this.field4979;
    }

    @ObfuscatedName("tc.az(Ljr;I)V")
    public void method8074(class240 arg0) {
        if (this.field4979 == null || this.field4979 != arg0) {
            this.method8081(arg0);
            this.method8077(-1, -1, -1);
        }
    }

    @ObfuscatedName("tc.av(Ljr;B)V")
    public void method8081(class240 arg0) {
        this.field4979 = arg0;
        this.field4981 = new class242(this.field5020, this.field4975, this.field4969, this.field4970);
        this.field4982.method8047(this.field4979 == null ? null : this.field4979.method4274());
    }

    @ObfuscatedName("tc.ak(Ljr;Lmu;Lmu;ZI)V")
    public void method8076(class240 arg0, class337 arg1, class337 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4979 == null || this.field4979 != arg0) {
            this.method8081(arg0);
        }
        if (!arg3 && this.field4979.method4267(arg1.field3605, arg1.field3604, arg1.field3603)) {
            this.method8077(arg1.field3605, arg1.field3604, arg1.field3603);
        } else {
            this.method8077(arg2.field3605, arg2.field3604, arg2.field3603);
        }
    }

    @ObfuscatedName("tc.ay(IIIB)V")
    public void method8077(int arg0, int arg1, int arg2) {
        if (this.field4979 == null) {
            return;
        }
        int[] var4 = this.field4979.method4269(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4979.method4269(this.field4979.method4284(), this.field4979.method4268(), this.field4979.method4285());
        }
        this.method8067(var4[0] - this.field4979.method4279() * 64, var4[1] - this.field4979.method4281() * 64, true);
        this.field4985 = -1;
        this.field4995 = -1;
        this.field4976 = this.method8084(this.field4979.method4302());
        this.field5010 = this.field4976;
        this.field5015 = null;
        this.field4998 = null;
        this.field4981.method4497();
    }

    @ObfuscatedName("tc.as(IIIIIB)V")
    public void method8078(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class541.method8937(var6);
        class541.method8876(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var7 = this.field4982.method8050();
        if (var7 < 100) {
            this.method8083(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4981.method4467()) {
            this.field4981.method4466(this.field4986, this.field4979.method4274(), client.field680);
            if (!this.field4981.method4467()) {
                return;
            }
        }
        class541.method8884(arg0, arg1, arg2, arg3, this.field4981.method4474());
        if (this.field5014 != null) {
            this.field5021++;
            if (this.field5021 % this.field4994 == 0) {
                this.field5021 = 0;
                this.field4997++;
            }
            if (this.field4997 >= this.field4993 && !this.field5022) {
                this.field5014 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4976));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4976));
        this.field4981.method4469(this.field4983 - var8 / 2, this.field4984 - var9 / 2, var8 / 2 + this.field4983, var9 / 2 + this.field4984, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5016) {
            boolean var10 = false;
            if (arg4 - this.field5013 > 100) {
                this.field5013 = arg4;
                var10 = true;
            }
            this.field4981.method4473(this.field4983 - var8 / 2, this.field4984 - var9 / 2, var8 / 2 + this.field4983, var9 / 2 + this.field4984, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5011, this.field5014, this.field5021, this.field4994, var10);
        }
        this.method8135(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method728() && this.field4991 && this.field5018 != null) {
            this.field4974.method7109("Coord: " + this.field5018, class541.field5251 + 10, class541.field5253 + 20, 16776960, -1);
        }
        this.field4989 = var8;
        this.field4971 = var9;
        this.field5003 = arg0;
        this.field4992 = arg1;
        class541.method8879(var6);
    }

    @ObfuscatedName("tc.ab(IIIIIII)Z")
    public boolean method8079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5004 == null) {
            return true;
        } else if (this.field5004.field5276 != arg0 || this.field5004.field5277 != arg1) {
            return true;
        } else if (this.field4981.field2551 != this.field4980) {
            return true;
        } else if (client.field759 != this.field5024) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tc.ah(IIIIIII)V")
    public void method8135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3600 == null) {
            return;
        }
        int var7 = 512 / (this.field4981.field2551 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8093() - arg4 / 2 - var7;
        int var14 = this.method8094() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4981.field2551 * (var7 + var13 - this.field4988);
        int var16 = arg1 - this.field4981.field2551 * (var7 - (var14 - this.field5023));
        if (this.method8079(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5004 != null && this.field5004.field5276 == var11 && this.field5004.field5277 == var12) {
                Arrays.fill(this.field5004.field5281, 0);
            } else {
                this.field5004 = new class545(var11, var12);
            }
            this.field4988 = this.method8093() - arg4 / 2 - var7;
            this.field5023 = this.method8094() - arg5 / 2 - var7;
            this.field4980 = this.field4981.field2551;
            Statics.field3600.method6610(this.field4988, this.field5023, this.field5004, (float) this.field4980 / var10);
            this.field5024 = client.field759;
            var15 = arg0 - this.field4981.field2551 * (var7 + var13 - this.field4988);
            var16 = arg1 - this.field4981.field2551 * (var7 - (var14 - this.field5023));
        }
        class541.method8936(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5004.method9005(var15, var16, 192);
        } else {
            this.field5004.method8993(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tc.ai(IIIII)V")
    public void method8230(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4982.method8049()) {
            return;
        }
        if (!this.field4981.method4467()) {
            this.field4981.method4466(this.field4986, this.field4979.method4274(), client.field680);
            if (!this.field4981.method4467()) {
                return;
            }
        }
        this.field4981.method4494(arg0, arg1, arg2, arg3, this.field5014, this.field5021, this.field4994);
    }

    @ObfuscatedName("tc.ac(II)V")
    public void method8082(int arg0) {
        this.field5010 = this.method8084(arg0);
    }

    @ObfuscatedName("tc.al(IIIIII)V")
    public void method8083(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class541.method8884(arg0, arg1, arg2, arg3, -16777216);
        class541.method8874(var7 - 152, var8, 304, 34, -65536);
        class541.method8884(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4974.method7112(class367.field4170, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tc.at(II)F")
    public float method8084(int arg0) {
        if (arg0 == 25) {
            return 1.0F;
        } else if (arg0 == 37) {
            return 1.5F;
        } else if (arg0 == 50) {
            return 2.0F;
        } else if (arg0 == 75) {
            return 3.0F;
        } else if (arg0 == 100) {
            return 4.0F;
        } else {
            return 8.0F;
        }
    }

    @ObfuscatedName("tc.bj(B)I")
    public int method8228() {
        if ((double) this.field5010 == 1.0D) {
            return 25;
        } else if ((double) this.field5010 == 1.5D) {
            return 37;
        } else if ((double) this.field5010 == 2.0D) {
            return 50;
        } else if ((double) this.field5010 == 3.0D) {
            return 75;
        } else if ((double) this.field5010 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tc.bd(B)V")
    public void method8086() {
        this.field4982.method8057();
    }

    @ObfuscatedName("tc.bg(S)Z")
    public boolean method8087() {
        return this.field4982.method8049();
    }

    @ObfuscatedName("tc.bt(II)Ljr;")
    public class240 method8195(int arg0) {
        Iterator var2 = this.field4977.values().iterator();
        class240 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class240) var2.next();
        } while (var3.method4272() != arg0);
        return var3;
    }

    @ObfuscatedName("tc.br(III)V")
    public void method8089(int arg0, int arg1) {
        if (this.field4979 != null && this.field4979.method4277(arg0, arg1)) {
            this.field4985 = arg0 - this.field4979.method4279() * 64;
            this.field4995 = arg1 - this.field4979.method4281() * 64;
        }
    }

    @ObfuscatedName("tc.ba(IIB)V")
    public void method8123(int arg0, int arg1) {
        if (this.field4979 != null) {
            this.method8067(arg0 - this.field4979.method4279() * 64, arg1 - this.field4979.method4281() * 64, true);
            this.field4985 = -1;
            this.field4995 = -1;
        }
    }

    @ObfuscatedName("tc.bk(IIIB)V")
    public void method8169(int arg0, int arg1, int arg2) {
        if (this.field4979 != null) {
            int[] var4 = this.field4979.method4269(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8089(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tc.bn(IIII)V")
    public void method8072(int arg0, int arg1, int arg2) {
        if (this.field4979 != null) {
            int[] var4 = this.field4979.method4269(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8123(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tc.by(I)I")
    public int method8093() {
        return this.field4979 == null ? -1 : this.field4983 + this.field4979.method4279() * 64;
    }

    @ObfuscatedName("tc.bc(I)I")
    public int method8094() {
        return this.field4979 == null ? -1 : this.field4984 + this.field4979.method4281() * 64;
    }

    @ObfuscatedName("tc.bx(B)Lmu;")
    public class337 method8095() {
        return this.field4979 == null ? null : this.field4979.method4319(this.method8093(), this.method8094());
    }

    @ObfuscatedName("tc.bf(S)I")
    public int method8096() {
        return this.field4989;
    }

    @ObfuscatedName("tc.bp(B)I")
    public int method8183() {
        return this.field4971;
    }

    @ObfuscatedName("tc.bv(IB)V")
    public void method8098(int arg0) {
        if (arg0 >= 1) {
            this.field4993 = arg0;
        }
    }

    @ObfuscatedName("tc.bm(S)V")
    public void method8099() {
        this.field4993 = 3;
    }

    @ObfuscatedName("tc.bq(IB)V")
    public void method8100(int arg0) {
        if (arg0 >= 1) {
            this.field4994 = arg0;
        }
    }

    @ObfuscatedName("tc.bb(B)V")
    public void method8101() {
        this.field4994 = 50;
    }

    @ObfuscatedName("tc.bh(ZI)V")
    public void method8102(boolean arg0) {
        this.field5022 = arg0;
    }

    @ObfuscatedName("tc.bw(II)V")
    public void method8103(int arg0) {
        this.field5014 = new HashSet();
        this.field5014.add(arg0);
        this.field4997 = 0;
        this.field5021 = 0;
    }

    @ObfuscatedName("tc.bi(II)V")
    public void method8253(int arg0) {
        this.field5014 = new HashSet();
        this.field4997 = 0;
        this.field5021 = 0;
        for (int var2 = 0; var2 < Statics.field1688; var2++) {
            if (class178.method7281(var2) != null && class178.method7281(var2).field1862 == arg0) {
                this.field5014.add(class178.method7281(var2).field1842);
            }
        }
    }

    @ObfuscatedName("tc.bu(S)V")
    public void method8105() {
        this.field5014 = null;
    }

    @ObfuscatedName("tc.be(ZB)V")
    public void method8106(boolean arg0) {
        this.field5016 = !arg0;
    }

    @ObfuscatedName("tc.bs(IZI)V")
    public void method8107(int arg0, boolean arg1) {
        if (arg1) {
            this.field4990.remove(arg0);
        } else {
            this.field4990.add(arg0);
        }
        this.method8203();
    }

    @ObfuscatedName("tc.bl(IZI)V")
    public void method8132(int arg0, boolean arg1) {
        if (arg1) {
            this.field5009.remove(arg0);
        } else {
            this.field5009.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1688; var3++) {
            if (class178.method7281(var3) != null && class178.method7281(var3).field1862 == arg0) {
                int var4 = class178.method7281(var3).field1842;
                if (arg1) {
                    this.field4968.remove(var4);
                } else {
                    this.field4968.add(var4);
                }
            }
        }
        this.method8203();
    }

    @ObfuscatedName("tc.bz(I)Z")
    public boolean method8109() {
        return !this.field5016;
    }

    @ObfuscatedName("tc.bo(II)Z")
    public boolean method8110(int arg0) {
        return !this.field4990.contains(arg0);
    }

    @ObfuscatedName("tc.cg(II)Z")
    public boolean method8111(int arg0) {
        return !this.field5009.contains(arg0);
    }

    @ObfuscatedName("tc.cb(B)V")
    public void method8203() {
        this.field5011.clear();
        this.field5011.addAll(this.field4990);
        this.field5011.addAll(this.field4968);
    }

    @ObfuscatedName("tc.ci(IIIIIII)V")
    public void method8113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4982.method8049()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4976));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4976));
        List var9 = this.field4981.method4471(this.field4983 - var7 / 2 - 1, this.field4984 - var8 / 2 - 1, var7 / 2 + this.field4983 + 1, var8 / 2 + this.field4984 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class258 var11 = (class258) var10.next();
            class178 var12 = class178.method7281(var11.method4226());
            var13 = false;
            for (int var14 = this.field5012.length - 1; var14 >= 0; var14--) {
                if (var12.field1852[var14] != null) {
                    Statics.method6628(var12.field1852[var14], var12.field1856, this.field5012[var14], var11.method4226(), var11.field2668.method5721(), var11.field2664.method5721());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tc.cv(ILmu;I)Lmu;")
    public class337 method8234(int arg0, class337 arg1) {
        if (!this.field4982.method8049()) {
            return null;
        } else if (!this.field4981.method4467()) {
            return null;
        } else if (this.field4979.method4277(arg1.field3604, arg1.field3603)) {
            HashMap var3 = this.field4981.method4475();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class258 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class258 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2664;
                    }
                    var8 = (class258) var7.next();
                    int var9 = var8.field2664.field3604 - arg1.field3604;
                    int var10 = var8.field2664.field3603 - arg1.field3603;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2664;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tc.ct(IILmu;Lmu;B)V")
    public void method8115(int arg0, int arg1, class337 arg2, class337 arg3) {
        class88 var5 = new class88();
        class263 var6 = new class263(arg1, arg2, arg3);
        var5.method2269(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2266(10);
                break;
            case 1009:
                var5.method2266(11);
                break;
            case 1010:
                var5.method2266(12);
                break;
            case 1011:
                var5.method2266(13);
                break;
            case 1012:
                var5.method2266(14);
        }
        class71.method4538(var5);
    }

    @ObfuscatedName("tc.cp(B)Ljq;")
    public class258 method8116() {
        if (!this.field4982.method8049()) {
            return null;
        } else if (this.field4981.method4467()) {
            HashMap var1 = this.field4981.method4475();
            this.field5015 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5015.addAll(var3);
            }
            this.field4998 = this.field5015.iterator();
            return this.method8080();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tc.cq(I)Ljq;")
    public class258 method8080() {
        if (this.field4998 == null) {
            return null;
        }
        class258 var1;
        do {
            if (!this.field4998.hasNext()) {
                return null;
            }
            var1 = (class258) this.field4998.next();
        } while (var1.method4226() == -1);
        return var1;
    }
}
