package deob;

@ObfuscatedName("fy")
public class class179 extends class387 {

    @ObfuscatedName("fy.e")
    public static class249 field1947 = new class249(64);

    @ObfuscatedName("fy.r")
    public static class249 field1965 = new class249(64);

    @ObfuscatedName("fy.o")
    public static class249 field1948 = new class249(20);

    @ObfuscatedName("fy.u")
    public int field1951 = -1;

    @ObfuscatedName("fy.h")
    public int field1952 = 16777215;

    @ObfuscatedName("fy.q")
    public int field1945 = 70;

    @ObfuscatedName("fy.x")
    public int field1954 = -1;

    @ObfuscatedName("fy.p")
    public int field1955 = -1;

    @ObfuscatedName("fy.n")
    public int field1956 = -1;

    @ObfuscatedName("fy.m")
    public int field1957 = -1;

    @ObfuscatedName("fy.d")
    public int field1958 = 0;

    @ObfuscatedName("fy.j")
    public int field1953 = 0;

    @ObfuscatedName("fy.f")
    public int field1960 = -1;

    @ObfuscatedName("fy.g")
    public String field1961 = "";

    @ObfuscatedName("fy.t")
    public int field1962 = -1;

    @ObfuscatedName("fy.k")
    public int field1959 = 0;

    @ObfuscatedName("fy.b")
    public int[] field1964;

    @ObfuscatedName("fy.z")
    public int field1946 = -1;

    @ObfuscatedName("fy.ap")
    public int field1966 = -1;

    @ObfuscatedName("kn.c(II)Lfy;")
    public static class179 method4943(int arg0) {
        class179 var1 = (class179) field1947.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1963.method5066(32, arg0);
        class179 var3 = new class179();
        if (var2 != null) {
            var3.method3104(new class421(var2));
        }
        field1947.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fy.l(Lpi;B)V")
    public void method3104(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3097(arg0, var2);
        }
    }

    @ObfuscatedName("fy.s(Lpi;II)V")
    public void method3097(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1951 = arg0.method6649();
        } else if (arg1 == 2) {
            this.field1952 = arg0.method6668();
        } else if (arg1 == 3) {
            this.field1954 = arg0.method6649();
        } else if (arg1 == 4) {
            this.field1956 = arg0.method6649();
        } else if (arg1 == 5) {
            this.field1955 = arg0.method6649();
        } else if (arg1 == 6) {
            this.field1957 = arg0.method6649();
        } else if (arg1 == 7) {
            this.field1958 = arg0.method6830();
        } else if (arg1 == 8) {
            this.field1961 = arg0.method6675();
        } else if (arg1 == 9) {
            this.field1945 = arg0.method6666();
        } else if (arg1 == 10) {
            this.field1953 = arg0.method6830();
        } else if (arg1 == 11) {
            this.field1960 = 0;
        } else if (arg1 == 12) {
            this.field1962 = arg0.method6686();
        } else if (arg1 == 13) {
            this.field1959 = arg0.method6830();
        } else if (arg1 == 14) {
            this.field1960 = arg0.method6666();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1946 = arg0.method6666();
            if (this.field1946 == 65535) {
                this.field1946 = -1;
            }
            this.field1966 = arg0.method6666();
            if (this.field1966 == 65535) {
                this.field1966 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method6666();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6686();
            this.field1964 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1964[var5] = arg0.method6666();
                if (this.field1964[var5] == 65535) {
                    this.field1964[var5] = -1;
                }
            }
            this.field1964[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("fy.e(I)Lfy;")
    public final class179 method3098() {
        int var1 = -1;
        if (this.field1946 != -1) {
            var1 = class281.method6117(this.field1946);
        } else if (this.field1966 != -1) {
            var1 = class281.field3224[this.field1966];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1964.length - 1) {
            var2 = this.field1964[var1];
        } else {
            var2 = this.field1964[this.field1964.length - 1];
        }
        return var2 == -1 ? null : method4943(var2);
    }

    @ObfuscatedName("fy.r(II)Ljava/lang/String;")
    public String method3132(int arg0) {
        String var2 = this.field1961;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class336.method2569(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("fy.o(I)Lpt;")
    public class434 method3134() {
        if (this.field1954 < 0) {
            return null;
        }
        class434 var1 = (class434) field1965.method4472((long) this.field1954);
        if (var1 != null) {
            return var1;
        }
        class434 var2 = class435.method2593(Statics.field2380, this.field1954, 0);
        if (var2 != null) {
            field1965.method4482(var2, (long) this.field1954);
        }
        return var2;
    }

    @ObfuscatedName("fy.i(I)Lpt;")
    public class434 method3095() {
        if (this.field1955 < 0) {
            return null;
        }
        class434 var1 = (class434) field1965.method4472((long) this.field1955);
        if (var1 != null) {
            return var1;
        }
        class434 var2 = class435.method2593(Statics.field2380, this.field1955, 0);
        if (var2 != null) {
            field1965.method4482(var2, (long) this.field1955);
        }
        return var2;
    }

    @ObfuscatedName("fy.w(I)Lpt;")
    public class434 method3102() {
        if (this.field1956 < 0) {
            return null;
        }
        class434 var1 = (class434) field1965.method4472((long) this.field1956);
        if (var1 != null) {
            return var1;
        }
        class434 var2 = class435.method2593(Statics.field2380, this.field1956, 0);
        if (var2 != null) {
            field1965.method4482(var2, (long) this.field1956);
        }
        return var2;
    }

    @ObfuscatedName("fy.v(B)Lpt;")
    public class434 method3103() {
        if (this.field1957 < 0) {
            return null;
        }
        class434 var1 = (class434) field1965.method4472((long) this.field1957);
        if (var1 != null) {
            return var1;
        }
        class434 var2 = class435.method2593(Statics.field2380, this.field1957, 0);
        if (var2 != null) {
            field1965.method4482(var2, (long) this.field1957);
        }
        return var2;
    }

    @ObfuscatedName("fy.a(B)Llv;")
    public class332 method3108() {
        if (this.field1951 == -1) {
            return null;
        }
        class332 var1 = (class332) field1948.method4472((long) this.field1951);
        if (var1 != null) {
            return var1;
        }
        class307 var2 = Statics.field2380;
        class307 var3 = Statics.field4487;
        int var4 = this.field1951;
        class332 var5;
        if (class435.method2591(var2, var4, 0)) {
            var5 = class435.method2815(var3.method5066(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1948.method4482(var5, (long) this.field1951);
        }
        return var5;
    }

    @ObfuscatedName("bf.y(B)V")
    public static void method1804() {
        field1947.method4475();
        field1965.method4475();
        field1948.method4475();
    }
}
