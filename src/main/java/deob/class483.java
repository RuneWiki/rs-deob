package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("si")
public class class483 {

    @ObfuscatedName("si.az")
    public class359 field4944;

    @ObfuscatedName("si.ap")
    public class359 field4902;

    @ObfuscatedName("si.aa")
    public class359 field4896;

    @ObfuscatedName("si.af")
    public static final class485 field4897 = class485.field4957;

    @ObfuscatedName("si.ad")
    public static final class485 field4898 = class485.field4964;

    @ObfuscatedName("si.aq")
    public static final class485 field4946 = class485.field4955;

    @ObfuscatedName("si.al")
    public class394 field4900;

    @ObfuscatedName("si.an")
    public HashMap field4941;

    @ObfuscatedName("si.ar")
    public class528[] field4934;

    @ObfuscatedName("si.ab")
    public HashMap field4936;

    @ObfuscatedName("si.ag")
    public class257 field4914;

    @ObfuscatedName("si.am")
    public class257 field4923;

    @ObfuscatedName("si.ax")
    public class257 field4906;

    @ObfuscatedName("si.ah")
    public class259 field4907;

    @ObfuscatedName("si.as")
    public class482 field4908;

    @ObfuscatedName("si.ay")
    public int field4930;

    @ObfuscatedName("si.aj")
    public int field4910;

    @ObfuscatedName("si.av")
    public int field4911 = -1;

    @ObfuscatedName("si.aw")
    public int field4904 = -1;

    @ObfuscatedName("si.ak")
    public float field4913;

    @ObfuscatedName("si.bh")
    public float field4901;

    @ObfuscatedName("si.bj")
    public int field4915 = -1;

    @ObfuscatedName("si.bk")
    public int field4916 = -1;

    @ObfuscatedName("si.bv")
    public int field4917 = -1;

    @ObfuscatedName("si.bt")
    public int field4918 = -1;

    @ObfuscatedName("si.bd")
    public int field4919 = 3;

    @ObfuscatedName("si.by")
    public int field4909 = 50;

    @ObfuscatedName("si.bs")
    public boolean field4921 = false;

    @ObfuscatedName("si.bm")
    public HashSet field4922 = null;

    @ObfuscatedName("si.bf")
    public int field4912 = -1;

    @ObfuscatedName("si.bq")
    public int field4924 = -1;

    @ObfuscatedName("si.ba")
    public int field4925 = -1;

    @ObfuscatedName("si.bl")
    public int field4926 = -1;

    @ObfuscatedName("si.bp")
    public int field4927 = -1;

    @ObfuscatedName("si.bu")
    public int field4928 = -1;

    @ObfuscatedName("si.bo")
    public long field4929;

    @ObfuscatedName("si.bb")
    public int field4942;

    @ObfuscatedName("si.br")
    public int field4905;

    @ObfuscatedName("si.be")
    public boolean field4932 = true;

    @ObfuscatedName("si.bx")
    public HashSet field4933 = new HashSet();

    @ObfuscatedName("si.bn")
    public HashSet field4903 = new HashSet();

    @ObfuscatedName("si.bw")
    public HashSet field4935 = new HashSet();

    @ObfuscatedName("si.bc")
    public HashSet field4890 = new HashSet();

    @ObfuscatedName("si.bg")
    public boolean field4937 = false;

    @ObfuscatedName("si.cw")
    public int field4895 = 0;

    @ObfuscatedName("si.cm")
    public final int[] field4947 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("si.cn")
    public List field4940;

    @ObfuscatedName("si.cs")
    public Iterator field4899;

    @ObfuscatedName("si.cx")
    public HashSet field4938 = new HashSet();

    @ObfuscatedName("si.cr")
    public class323 field4920 = null;

    @ObfuscatedName("si.cd")
    public boolean field4894 = false;

    @ObfuscatedName("si.ce")
    public class529 field4945;

    @ObfuscatedName("si.cq")
    public int field4931;

    @ObfuscatedName("si.cp")
    public int field4943 = -1;

    @ObfuscatedName("si.cv")
    public int field4948 = -1;

    @ObfuscatedName("si.co")
    public int field4949 = -1;

    @ObfuscatedName("si.au(Lnu;Lnu;Lnu;Lpi;Ljava/util/HashMap;[Luk;I)V")
    public void method7775(class359 arg0, class359 arg1, class359 arg2, class394 arg3, HashMap arg4, class528[] arg5) {
        this.field4934 = arg5;
        this.field4944 = arg0;
        this.field4902 = arg1;
        this.field4896 = arg2;
        this.field4900 = arg3;
        this.field4941 = new HashMap();
        this.field4941.put(class254.field2884, arg4.get(field4897));
        this.field4941.put(class254.field2879, arg4.get(field4898));
        this.field4941.put(class254.field2877, arg4.get(field4946));
        this.field4908 = new class482(arg0);
        int var7 = this.field4944.method6167(class276.field3069.field3068);
        int[] var8 = this.field4944.method6137(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4936 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class515 var11 = new class515(this.field4944.method6128(var7, var8[var10]));
            class257 var12 = new class257();
            var12.method4731(var11, var8[var10]);
            this.field4936.put(var12.method4746(), var12);
            if (var12.method4738()) {
                this.field4914 = var12;
            }
        }
        this.method7790(this.field4914);
        this.field4906 = null;
    }

    @ObfuscatedName("si.ae(B)V")
    public void method7776() {
        class258.method285();
    }

    @ObfuscatedName("si.ao(IIZIIIIB)V")
    public void method7884(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4908.method7766()) {
            return;
        }
        this.method7780();
        this.method7781();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4913));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4913));
        List var10 = this.field4907.method4931(this.field4930 - var8 / 2 - 1, this.field4910 - var9 / 2 - 1, var8 / 2 + this.field4930 + 1, var9 / 2 + this.field4910 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class275 var13 = (class275) var12.next();
            var11.add(var13);
            class88 var14 = new class88();
            class280 var15 = new class280(var13.method4685(), var13.field3059, var13.field3058);
            var14.method2193(new Object[] { var15, arg0, arg1 });
            if (this.field4938.contains(var13)) {
                var14.method2191(17);
            } else {
                var14.method2191(15);
            }
            class71.method5065(var14);
        }
        Iterator var16 = this.field4938.iterator();
        while (var16.hasNext()) {
            class275 var17 = (class275) var16.next();
            if (!var11.contains(var17)) {
                class88 var18 = new class88();
                class280 var19 = new class280(var17.method4685(), var17.field3059, var17.field3058);
                var18.method2193(new Object[] { var19, arg0, arg1 });
                var18.method2191(16);
                class71.method5065(var18);
            }
        }
        this.field4938 = var11;
    }

    @ObfuscatedName("si.at(IIZZI)V")
    public void method7778(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class302.method655();
            this.method7941(arg0, arg1, arg3, var5);
            if (!this.method7873() && (arg3 || arg2)) {
                boolean var7 = client.field711 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4927 = arg0;
                        this.field4928 = arg1;
                        this.field4925 = this.field4930;
                        this.field4926 = this.field4910;
                    }
                    if (this.field4925 != -1) {
                        int var8 = arg0 - this.field4927;
                        int var9 = arg1 - this.field4928;
                        this.method7793(this.field4925 - (int) ((float) var8 / this.field4901), this.field4926 + (int) ((float) var9 / this.field4901), false);
                    }
                    break label33;
                }
            }
            this.method7909();
        }
        if (arg3) {
            this.field4929 = var5;
            this.field4942 = arg0;
            this.field4905 = arg1;
        }
    }

    @ObfuscatedName("si.ac(IIZJ)V")
    public void method7941(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4923 == null) {
            this.field4920 = null;
            return;
        }
        int var6 = (int) ((float) this.field4930 + ((float) (arg0 - this.field4917) - (float) this.method7812() * this.field4913 / 2.0F) / this.field4913);
        int var7 = (int) ((float) this.field4910 - ((float) (arg1 - this.field4918) - (float) this.method7813() * this.field4913 / 2.0F) / this.field4913);
        this.field4920 = this.field4923.method4736(var6 + this.field4923.method4743() * 64, var7 + this.field4923.method4776() * 64);
        if (this.field4920 == null || !arg2) {
            return;
        }
        class213 var8 = client.method5038();
        boolean var9 = client.field615 >= 2;
        if (var9 && var8.method3811(82) && var8.method3811(81)) {
            client.method2524(this.field4920.field3543, this.field4920.field3545, this.field4920.field3544, false);
            return;
        }
        boolean var10 = true;
        if (this.field4932) {
            int var11 = arg0 - this.field4942;
            int var12 = arg1 - this.field4905;
            if (arg3 - this.field4929 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                var10 = false;
            }
        }
        if (var10) {
            class297 var13 = class297.method1166(class295.field3185, client.field592.field1429);
            var13.field3227.method8464(this.field4920.method5500());
            client.field592.method2665(var13);
            this.field4929 = 0L;
        }
    }

    @ObfuscatedName("si.ai(S)V")
    public void method7780() {
        if (Statics.field4442 != null) {
            this.field4913 = this.field4901;
            return;
        }
        if (this.field4913 < this.field4901) {
            this.field4913 = Math.min(this.field4901, this.field4913 / 30.0F + this.field4913);
        }
        if (this.field4913 > this.field4901) {
            this.field4913 = Math.max(this.field4901, this.field4913 - this.field4913 / 30.0F);
        }
    }

    @ObfuscatedName("si.az(B)V")
    public void method7781() {
        if (!this.method7873()) {
            return;
        }
        int var1 = this.field4911 - this.field4930;
        int var2 = this.field4904 - this.field4910;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7793(this.field4930 + var1, this.field4910 + var2, true);
        if (this.field4930 == this.field4911 && this.field4910 == this.field4904) {
            this.field4911 = -1;
            this.field4904 = -1;
        }
    }

    @ObfuscatedName("si.ap(IIZB)V")
    public final void method7793(int arg0, int arg1, boolean arg2) {
        this.field4930 = arg0;
        this.field4910 = arg1;
        class302.method655();
        if (arg2) {
            this.method7909();
        }
    }

    @ObfuscatedName("si.aa(I)V")
    public final void method7909() {
        this.field4928 = -1;
        this.field4927 = -1;
        this.field4926 = -1;
        this.field4925 = -1;
    }

    @ObfuscatedName("si.af(I)Z")
    public boolean method7873() {
        return this.field4911 != -1 && this.field4904 != -1;
    }

    @ObfuscatedName("si.ad(IIII)Ljf;")
    public class257 method7785(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4936.values().iterator();
        class257 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class257) var4.next();
        } while (!var5.method4732(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("si.aq(IIIZB)V")
    public void method7783(int arg0, int arg1, int arg2, boolean arg3) {
        class257 var5 = this.method7785(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4914;
        }
        boolean var6 = false;
        if (this.field4906 != var5 || arg3) {
            this.field4906 = var5;
            this.method7790(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7927(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("si.al(IB)V")
    public void method7787(int arg0) {
        class257 var2 = this.method7855(arg0);
        if (var2 != null) {
            this.method7790(var2);
        }
    }

    @ObfuscatedName("si.an(I)I")
    public int method7788() {
        return this.field4923 == null ? -1 : this.field4923.method4747();
    }

    @ObfuscatedName("si.ar(B)Ljf;")
    public class257 method7789() {
        return this.field4923;
    }

    @ObfuscatedName("si.ab(Ljf;I)V")
    public void method7790(class257 arg0) {
        if (this.field4923 == null || this.field4923 != arg0) {
            this.method7791(arg0);
            this.method7927(-1, -1, -1);
        }
    }

    @ObfuscatedName("si.ag(Ljf;I)V")
    public void method7791(class257 arg0) {
        this.field4923 = arg0;
        this.field4907 = new class259(this.field4934, this.field4941, this.field4902, this.field4896);
        this.field4908.method7763(this.field4923 == null ? null : this.field4923.method4746());
    }

    @ObfuscatedName("si.am(Ljf;Lmc;Lmc;ZI)V")
    public void method7792(class257 arg0, class323 arg1, class323 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4923 == null || this.field4923 != arg0) {
            this.method7791(arg0);
        }
        if (!arg3 && this.field4923.method4732(arg1.field3544, arg1.field3543, arg1.field3545)) {
            this.method7927(arg1.field3544, arg1.field3543, arg1.field3545);
        } else {
            this.method7927(arg2.field3544, arg2.field3543, arg2.field3545);
        }
    }

    @ObfuscatedName("si.ax(IIIB)V")
    public void method7927(int arg0, int arg1, int arg2) {
        if (this.field4923 == null) {
            return;
        }
        int[] var4 = this.field4923.method4762(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4923.method4762(this.field4923.method4748(), this.field4923.method4784(), this.field4923.method4749());
        }
        this.method7793(var4[0] - this.field4923.method4743() * 64, var4[1] - this.field4923.method4776() * 64, true);
        this.field4911 = -1;
        this.field4904 = -1;
        this.field4913 = this.method7800(this.field4923.method4742());
        this.field4901 = this.field4913;
        this.field4940 = null;
        this.field4899 = null;
        this.field4907.method4939();
    }

    @ObfuscatedName("si.ah(IIIIIB)V")
    public void method7945(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class525.method8606(var6);
        class525.method8621(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class525.method8612(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4908.method7767();
        if (var7 < 100) {
            this.method7811(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4907.method4933()) {
            this.field4907.method4926(this.field4944, this.field4923.method4746(), client.field554);
            if (!this.field4907.method4933()) {
                return;
            }
        }
        if (this.field4922 != null) {
            this.field4924++;
            if (this.field4924 % this.field4909 == 0) {
                this.field4924 = 0;
                this.field4912++;
            }
            if (this.field4912 >= this.field4919 && !this.field4921) {
                this.field4922 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4913));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4913));
        this.field4907.method4928(this.field4930 - var8 / 2, this.field4910 - var9 / 2, var8 / 2 + this.field4930, var9 / 2 + this.field4910, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4937) {
            boolean var10 = false;
            if (arg4 - this.field4895 > 100) {
                this.field4895 = arg4;
                var10 = true;
            }
            this.field4907.method4929(this.field4930 - var8 / 2, this.field4910 - var9 / 2, var8 / 2 + this.field4930, var9 / 2 + this.field4910, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4890, this.field4922, this.field4924, this.field4909, var10);
        }
        this.method7796(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field615 >= 2;
        if (var11 && this.field4894 && this.field4920 != null) {
            this.field4900.method6925("Coord: " + this.field4920, class525.field5187 + 10, class525.field5188 + 20, 16776960, -1);
        }
        this.field4915 = var8;
        this.field4916 = var9;
        this.field4917 = arg0;
        this.field4918 = arg1;
        class525.method8673(var6);
    }

    @ObfuscatedName("si.as(IIIIIII)Z")
    public boolean method7932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4945 == null) {
            return true;
        } else if (this.field4945.field5218 != arg0 || this.field4945.field5209 != arg1) {
            return true;
        } else if (this.field4907.field2949 != this.field4931) {
            return true;
        } else if (client.field650 != this.field4949) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("si.ay(IIIIIIS)V")
    public void method7796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4442 == null) {
            return;
        }
        int var7 = 512 / (this.field4907.field2949 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7809() - arg4 / 2 - var7;
        int var14 = this.method7887() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4907.field2949 * (var7 + var13 - this.field4943);
        int var16 = arg1 - this.field4907.field2949 * (var7 - (var14 - this.field4948));
        if (this.method7932(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4945 != null && this.field4945.field5218 == var11 && this.field4945.field5209 == var12) {
                Arrays.fill(this.field4945.field5216, 0);
            } else {
                this.field4945 = new class529(var11, var12);
            }
            this.field4943 = this.method7809() - arg4 / 2 - var7;
            this.field4948 = this.method7887() - arg5 / 2 - var7;
            this.field4931 = this.field4907.field2949;
            Statics.field4442.method6326(this.field4943, this.field4948, this.field4945, (float) this.field4931 / var10);
            this.field4949 = client.field650;
            var15 = arg0 - this.field4907.field2949 * (var7 + var13 - this.field4943);
            var16 = arg1 - this.field4907.field2949 * (var7 - (var14 - this.field4948));
        }
        class525.method8611(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4945.method8832(var15, var16, 192);
        } else {
            this.field4945.method8737(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("si.aj(IIIII)V")
    public void method7869(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4908.method7766()) {
            return;
        }
        if (!this.field4907.method4933()) {
            this.field4907.method4926(this.field4944, this.field4923.method4746(), client.field554);
            if (!this.field4907.method4933()) {
                return;
            }
        }
        this.field4907.method4930(arg0, arg1, arg2, arg3, this.field4922, this.field4924, this.field4909);
    }

    @ObfuscatedName("si.av(II)V")
    public void method7798(int arg0) {
        this.field4901 = this.method7800(arg0);
    }

    @ObfuscatedName("si.aw(IIIIIB)V")
    public void method7811(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class525.method8612(arg0, arg1, arg2, arg3, -16777216);
        class525.method8616(var7 - 152, var8, 304, 34, -65536);
        class525.method8612(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4900.method6846(class352.field4062, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("si.ak(II)F")
    public float method7800(int arg0) {
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

    @ObfuscatedName("si.bh(I)I")
    public int method7801() {
        if ((double) this.field4901 == 1.0D) {
            return 25;
        } else if ((double) this.field4901 == 1.5D) {
            return 37;
        } else if ((double) this.field4901 == 2.0D) {
            return 50;
        } else if ((double) this.field4901 == 3.0D) {
            return 75;
        } else if ((double) this.field4901 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("si.bj(B)V")
    public void method7802() {
        this.field4908.method7764();
    }

    @ObfuscatedName("si.bk(B)Z")
    public boolean method7893() {
        return this.field4908.method7766();
    }

    @ObfuscatedName("si.bv(IB)Ljf;")
    public class257 method7855(int arg0) {
        Iterator var2 = this.field4936.values().iterator();
        class257 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class257) var2.next();
        } while (var3.method4747() != arg0);
        return var3;
    }

    @ObfuscatedName("si.bt(IIB)V")
    public void method7805(int arg0, int arg1) {
        if (this.field4923 != null && this.field4923.method4739(arg0, arg1)) {
            this.field4911 = arg0 - this.field4923.method4743() * 64;
            this.field4904 = arg1 - this.field4923.method4776() * 64;
        }
    }

    @ObfuscatedName("si.bd(III)V")
    public void method7806(int arg0, int arg1) {
        if (this.field4923 != null) {
            this.method7793(arg0 - this.field4923.method4743() * 64, arg1 - this.field4923.method4776() * 64, true);
            this.field4911 = -1;
            this.field4904 = -1;
        }
    }

    @ObfuscatedName("si.by(IIII)V")
    public void method7807(int arg0, int arg1, int arg2) {
        if (this.field4923 != null) {
            int[] var4 = this.field4923.method4762(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7805(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("si.bs(IIII)V")
    public void method7808(int arg0, int arg1, int arg2) {
        if (this.field4923 != null) {
            int[] var4 = this.field4923.method4762(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7806(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("si.bm(I)I")
    public int method7809() {
        return this.field4923 == null ? -1 : this.field4930 + this.field4923.method4743() * 64;
    }

    @ObfuscatedName("si.bf(I)I")
    public int method7887() {
        return this.field4923 == null ? -1 : this.field4910 + this.field4923.method4776() * 64;
    }

    @ObfuscatedName("si.bq(I)Lmc;")
    public class323 method7784() {
        return this.field4923 == null ? null : this.field4923.method4736(this.method7809(), this.method7887());
    }

    @ObfuscatedName("si.ba(I)I")
    public int method7812() {
        return this.field4915;
    }

    @ObfuscatedName("si.bl(I)I")
    public int method7813() {
        return this.field4916;
    }

    @ObfuscatedName("si.bp(II)V")
    public void method7814(int arg0) {
        if (arg0 >= 1) {
            this.field4919 = arg0;
        }
    }

    @ObfuscatedName("si.bu(B)V")
    public void method7815() {
        this.field4919 = 3;
    }

    @ObfuscatedName("si.bo(IS)V")
    public void method7816(int arg0) {
        if (arg0 >= 1) {
            this.field4909 = arg0;
        }
    }

    @ObfuscatedName("si.bb(I)V")
    public void method7817() {
        this.field4909 = 50;
    }

    @ObfuscatedName("si.br(ZI)V")
    public void method7818(boolean arg0) {
        this.field4921 = arg0;
    }

    @ObfuscatedName("si.be(II)V")
    public void method7795(int arg0) {
        this.field4922 = new HashSet();
        this.field4922.add(arg0);
        this.field4912 = 0;
        this.field4924 = 0;
    }

    @ObfuscatedName("si.bi(II)V")
    public void method7820(int arg0) {
        this.field4922 = new HashSet();
        this.field4912 = 0;
        this.field4924 = 0;
        for (int var2 = 0; var2 < Statics.field1942; var2++) {
            if (class188.method2945(var2) != null && class188.method2945(var2).field1963 == arg0) {
                this.field4922.add(class188.method2945(var2).field1948);
            }
        }
    }

    @ObfuscatedName("si.bz(I)V")
    public void method7821() {
        this.field4922 = null;
    }

    @ObfuscatedName("si.bx(ZI)V")
    public void method7822(boolean arg0) {
        this.field4937 = !arg0;
    }

    @ObfuscatedName("si.bn(IZB)V")
    public void method7867(int arg0, boolean arg1) {
        if (arg1) {
            this.field4933.remove(arg0);
        } else {
            this.field4933.add(arg0);
        }
        this.method7828();
    }

    @ObfuscatedName("si.bw(IZB)V")
    public void method7786(int arg0, boolean arg1) {
        if (arg1) {
            this.field4903.remove(arg0);
        } else {
            this.field4903.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1942; var3++) {
            if (class188.method2945(var3) != null && class188.method2945(var3).field1963 == arg0) {
                int var4 = class188.method2945(var3).field1948;
                if (arg1) {
                    this.field4935.remove(var4);
                } else {
                    this.field4935.add(var4);
                }
            }
        }
        this.method7828();
    }

    @ObfuscatedName("si.bc(I)Z")
    public boolean method7825() {
        return !this.field4937;
    }

    @ObfuscatedName("si.bg(IB)Z")
    public boolean method7937(int arg0) {
        return !this.field4933.contains(arg0);
    }

    @ObfuscatedName("si.cw(II)Z")
    public boolean method7827(int arg0) {
        return !this.field4903.contains(arg0);
    }

    @ObfuscatedName("si.cf(I)V")
    public void method7828() {
        this.field4890.clear();
        this.field4890.addAll(this.field4933);
        this.field4890.addAll(this.field4935);
    }

    @ObfuscatedName("si.cm(IIIIIII)V")
    public void method7829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4908.method7766()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4913));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4913));
        List var9 = this.field4907.method4931(this.field4930 - var7 / 2 - 1, this.field4910 - var8 / 2 - 1, var7 / 2 + this.field4930 + 1, var8 / 2 + this.field4910 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class275 var11 = (class275) var10.next();
            class188 var12 = class188.method2945(var11.method4685());
            var13 = false;
            for (int var14 = this.field4947.length - 1; var14 >= 0; var14--) {
                if (var12.field1952[var14] != null) {
                    client.method6575(var12.field1952[var14], var12.field1944, this.field4947[var14], var11.method4685(), var11.field3059.method5500(), var11.field3058.method5500());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("si.cn(ILmc;I)Lmc;")
    public class323 method7830(int arg0, class323 arg1) {
        if (!this.field4908.method7766()) {
            return null;
        } else if (!this.field4907.method4933()) {
            return null;
        } else if (this.field4923.method4739(arg1.field3543, arg1.field3545)) {
            HashMap var3 = this.field4907.method4934();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class275 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class275 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3058;
                    }
                    var8 = (class275) var7.next();
                    int var9 = var8.field3058.field3543 - arg1.field3543;
                    int var10 = var8.field3058.field3545 - arg1.field3545;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3058;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("si.cs(IILmc;Lmc;I)V")
    public void method7972(int arg0, int arg1, class323 arg2, class323 arg3) {
        class88 var5 = new class88();
        class280 var6 = new class280(arg1, arg2, arg3);
        var5.method2193(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2191(10);
                break;
            case 1009:
                var5.method2191(11);
                break;
            case 1010:
                var5.method2191(12);
                break;
            case 1011:
                var5.method2191(13);
                break;
            case 1012:
                var5.method2191(14);
        }
        class71.method5065(var5);
    }

    @ObfuscatedName("si.cx(I)Lkp;")
    public class275 method7777() {
        if (!this.field4908.method7766()) {
            return null;
        } else if (this.field4907.method4933()) {
            HashMap var1 = this.field4907.method4934();
            this.field4940 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4940.addAll(var3);
            }
            this.field4899 = this.field4940.iterator();
            return this.method7833();
        } else {
            return null;
        }
    }

    @ObfuscatedName("si.cr(I)Lkp;")
    public class275 method7833() {
        if (this.field4899 == null) {
            return null;
        }
        class275 var1;
        do {
            if (!this.field4899.hasNext()) {
                return null;
            }
            var1 = (class275) this.field4899.next();
        } while (var1.method4685() == -1);
        return var1;
    }
}
