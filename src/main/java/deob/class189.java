package deob;

@ObfuscatedName("ho")
public class class189 extends class485 {

    @ObfuscatedName("ho.aj")
    public static class302 field1976 = new class302(64);

    @ObfuscatedName("ho.aq")
    public static class302 field1950 = new class302(50);

    @ObfuscatedName("ho.ar")
    public int field1947;

    @ObfuscatedName("ho.ag")
    public String field1952 = class367.field4120;

    @ObfuscatedName("ho.ao")
    public int field1980 = 1;

    @ObfuscatedName("ho.ae")
    public int[] field1958;

    @ObfuscatedName("ho.aa")
    public int[] field1955;

    @ObfuscatedName("ho.au")
    public int field1956 = -1;

    @ObfuscatedName("ho.an")
    public int field1957 = -1;

    @ObfuscatedName("ho.ad")
    public int field1981 = -1;

    @ObfuscatedName("ho.ax")
    public int field1959 = -1;

    @ObfuscatedName("ho.aw")
    public int field1960 = -1;

    @ObfuscatedName("ho.az")
    public int field1951 = -1;

    @ObfuscatedName("ho.av")
    public int field1953 = -1;

    @ObfuscatedName("ho.ak")
    public int field1963 = -1;

    @ObfuscatedName("ho.ay")
    public int field1964 = -1;

    @ObfuscatedName("ho.as")
    public int field1965 = -1;

    @ObfuscatedName("ho.ab")
    public int field1966 = -1;

    @ObfuscatedName("ho.ah")
    public int field1975 = -1;

    @ObfuscatedName("ho.ai")
    public int field1968 = -1;

    @ObfuscatedName("ho.ac")
    public int field1969 = -1;

    @ObfuscatedName("ho.al")
    public int field1970 = -1;

    @ObfuscatedName("ho.at")
    public short[] field1971;

    @ObfuscatedName("ho.bj")
    public short[] field1972;

    @ObfuscatedName("ho.bd")
    public short[] field1973;

    @ObfuscatedName("ho.bg")
    public short[] field1974;

    @ObfuscatedName("ho.bt")
    public String[] field1978 = new String[5];

    @ObfuscatedName("ho.br")
    public boolean field1946 = true;

    @ObfuscatedName("ho.ba")
    public int field1977 = -1;

    @ObfuscatedName("ho.bk")
    public int field1954 = 128;

    @ObfuscatedName("ho.bn")
    public int field1979 = 128;

    @ObfuscatedName("ho.by")
    public boolean field1949 = false;

    @ObfuscatedName("ho.bc")
    public int field1991 = 0;

    @ObfuscatedName("ho.bx")
    public int field1961 = 0;

    @ObfuscatedName("ho.bf")
    public int field1983 = 32;

    @ObfuscatedName("ho.bp")
    public int[] field1984;

    @ObfuscatedName("ho.bv")
    public int field1985 = -1;

    @ObfuscatedName("ho.bm")
    public int field1986 = -1;

    @ObfuscatedName("ho.bq")
    public boolean field1987 = true;

    @ObfuscatedName("ho.bb")
    public boolean field1988 = true;

    @ObfuscatedName("ho.bh")
    public boolean field1989 = false;

    @ObfuscatedName("ho.bw")
    public int[] field1990 = null;

    @ObfuscatedName("ho.bi")
    public short[] field1982 = null;

    @ObfuscatedName("ho.bu")
    public class504 field1992;

    @ObfuscatedName("ax.am(Low;Low;I)V")
    public static void method166(class375 arg0, class375 arg1) {
        Statics.field1962 = arg0;
        Statics.field1948 = arg1;
    }

    @ObfuscatedName("dd.ap(II)Lho;")
    public static class189 method2165(int arg0) {
        class189 var1 = (class189) field1976.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1962.method6396(9, arg0);
        class189 var3 = new class189();
        var3.field1947 = arg0;
        if (var2 != null) {
            var3.method3426(new class531(var2));
        }
        var3.method3409();
        field1976.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.af(I)V")
    public void method3409() {
    }

    @ObfuscatedName("ho.aj(Luk;I)V")
    public void method3426(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3460(arg0, var2);
        }
    }

    @ObfuscatedName("ho.aq(Luk;IB)V")
    public void method3460(class531 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8561();
            this.field1958 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1958[var4] = arg0.method8775();
            }
        } else if (arg1 == 2) {
            this.field1952 = arg0.method8641();
        } else if (arg1 == 12) {
            this.field1980 = arg0.method8561();
        } else if (arg1 == 13) {
            this.field1956 = arg0.method8775();
        } else if (arg1 == 14) {
            this.field1959 = arg0.method8775();
        } else if (arg1 == 15) {
            this.field1957 = arg0.method8775();
        } else if (arg1 == 16) {
            this.field1981 = arg0.method8775();
        } else if (arg1 == 17) {
            this.field1959 = arg0.method8775();
            this.field1960 = arg0.method8775();
            this.field1951 = arg0.method8775();
            this.field1953 = arg0.method8775();
        } else if (arg1 == 18) {
            arg0.method8775();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1978[arg1 - 30] = arg0.method8641();
            if (this.field1978[arg1 - 30].equalsIgnoreCase(class367.field3979)) {
                this.field1978[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8561();
            this.field1971 = new short[var5];
            this.field1972 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1971[var6] = (short) arg0.method8775();
                this.field1972[var6] = (short) arg0.method8775();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8561();
            this.field1973 = new short[var7];
            this.field1974 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1973[var8] = (short) arg0.method8775();
                this.field1974[var8] = (short) arg0.method8775();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8561();
            this.field1955 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1955[var10] = arg0.method8775();
            }
        } else if (arg1 == 93) {
            this.field1946 = false;
        } else if (arg1 == 95) {
            this.field1977 = arg0.method8775();
        } else if (arg1 == 97) {
            this.field1954 = arg0.method8775();
        } else if (arg1 == 98) {
            this.field1979 = arg0.method8775();
        } else if (arg1 == 99) {
            this.field1949 = true;
        } else if (arg1 == 100) {
            this.field1991 = arg0.method8562();
        } else if (arg1 == 101) {
            this.field1961 = arg0.method8562() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method8561();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field1990 = new int[var12];
            this.field1982 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field1990[var14] = -1;
                    this.field1982[var14] = -1;
                } else {
                    this.field1990[var14] = arg0.method8721();
                    this.field1982[var14] = (short) arg0.method8563();
                }
            }
        } else if (arg1 == 103) {
            this.field1983 = arg0.method8775();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1985 = arg0.method8775();
            if (this.field1985 == 65535) {
                this.field1985 = -1;
            }
            this.field1986 = arg0.method8775();
            if (this.field1986 == 65535) {
                this.field1986 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8775();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8561();
            this.field1984 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field1984[var17] = arg0.method8775();
                if (this.field1984[var17] == 65535) {
                    this.field1984[var17] = -1;
                }
            }
            this.field1984[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field1987 = false;
        } else if (arg1 == 109) {
            this.field1988 = false;
        } else if (arg1 == 111) {
            this.field1989 = true;
        } else if (arg1 == 114) {
            this.field1963 = arg0.method8775();
        } else if (arg1 == 115) {
            this.field1963 = arg0.method8775();
            this.field1964 = arg0.method8775();
            this.field1965 = arg0.method8775();
            this.field1966 = arg0.method8775();
        } else if (arg1 == 116) {
            this.field1975 = arg0.method8775();
        } else if (arg1 == 117) {
            this.field1975 = arg0.method8775();
            this.field1968 = arg0.method8775();
            this.field1969 = arg0.method8775();
            this.field1970 = arg0.method8775();
        } else if (arg1 == 249) {
            this.field1992 = class182.method4263(arg0, this.field1992);
        }
    }

    @ObfuscatedName("ho.ar(Lhl;ILhl;ILhb;B)Lko;")
    public final class283 method3422(class205 arg0, int arg1, class205 arg2, int arg3, class188 arg4) {
        if (this.field1984 != null) {
            class189 var6 = this.method3459();
            return var6 == null ? null : var6.method3422(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field1947;
        if (arg4 != null) {
            var7 |= arg4.field1944 << 16;
        }
        class283 var9 = (class283) field1950.method5400(var7);
        if (var9 == null) {
            class265 var10 = this.method3397(this.field1958, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4672(this.field1991 + 64, this.field1961 + 850, -30, -50, -30);
            field1950.method5402(var9, var7);
        }
        class283 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3776(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3789(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method5132(true);
        } else {
            var11 = arg2.method3789(var9, arg3);
        }
        if (this.field1954 != 128 || this.field1979 != 128) {
            var11.method5153(this.field1954, this.field1979, this.field1954);
        }
        return var11;
    }

    @ObfuscatedName("ho.ag(Lhb;B)Lkm;")
    public final class265 method3401(class188 arg0) {
        if (this.field1984 == null) {
            return this.method3397(this.field1955, arg0);
        } else {
            class189 var2 = this.method3459();
            return var2 == null ? null : var2.method3401(arg0);
        }
    }

    @ObfuscatedName("ho.ao([ILhb;I)Lkm;")
    public class265 method3397(int[] arg0, class188 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1940 != null) {
            var3 = arg1.field1940;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1948.method6431(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class265[] var6 = new class265[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class265.method4650(Statics.field1948, var3[var7], 0);
        }
        class265 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class265(var6, var6.length);
            }
        } else {
            var8 = new class265(var6, var6.length);
        }
        if (this.field1971 != null) {
            short[] var9 = this.field1972;
            if (arg1 != null && arg1.field1939 != null) {
                var9 = arg1.field1939;
            }
            for (int var10 = 0; var10 < this.field1971.length; var10++) {
                var8.method4664(this.field1971[var10], var9[var10]);
            }
        }
        if (this.field1973 != null) {
            short[] var11 = this.field1974;
            if (arg1 != null && arg1.field1942 != null) {
                var11 = arg1.field1942;
            }
            for (int var12 = 0; var12 < this.field1973.length; var12++) {
                var8.method4665(this.field1973[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("ho.ae(B)Lho;")
    public final class189 method3459() {
        int var1 = -1;
        if (this.field1985 != -1) {
            var1 = class336.method1124(this.field1985);
        } else if (this.field1986 != -1) {
            var1 = class336.field3598[this.field1986];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1984.length - 1) {
            var2 = this.field1984[var1];
        } else {
            var2 = this.field1984[this.field1984.length - 1];
        }
        return var2 == -1 ? null : method2165(var2);
    }

    @ObfuscatedName("ho.aa(I)Z")
    public boolean method3404() {
        if (this.field1984 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1985 != -1) {
            var1 = class336.method1124(this.field1985);
        } else if (this.field1986 != -1) {
            var1 = class336.field3598[this.field1986];
        }
        if (var1 >= 0 && var1 < this.field1984.length) {
            return this.field1984[var1] != -1;
        } else {
            return this.field1984[this.field1984.length - 1] != -1;
        }
    }

    @ObfuscatedName("ho.au(III)I")
    public int method3405(int arg0, int arg1) {
        class504 var3 = this.field1992;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class488 var5 = (class488) var3.method8286((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4887;
            }
        }
        return var4;
    }

    @ObfuscatedName("ho.an(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3406(int arg0, String arg1) {
        class504 var3 = this.field1992;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class486 var5 = (class486) var3.method8286((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4885;
            }
        }
        return var4;
    }

    @ObfuscatedName("bc.ad(I)V")
    public static void method715() {
        field1976.method5403();
        field1950.method5403();
    }

    @ObfuscatedName("ho.ax(S)Z")
    public boolean method3407() {
        return this.field1990 != null && this.field1982 != null;
    }

    @ObfuscatedName("ho.aw(I)[I")
    public int[] method3456() {
        return this.field1990;
    }

    @ObfuscatedName("ho.az(II)I")
    public int method3419(int arg0) {
        return this.field1990 == null || arg0 >= this.field1990.length ? -1 : this.field1990[arg0];
    }

    @ObfuscatedName("ho.av(B)[S")
    public short[] method3403() {
        return this.field1982;
    }

    @ObfuscatedName("ho.ak(II)S")
    public short method3410(int arg0) {
        return this.field1982 == null || arg0 >= this.field1982.length ? -1 : this.field1982[arg0];
    }
}
