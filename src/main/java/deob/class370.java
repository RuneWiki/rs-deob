package deob;

@ObfuscatedName("nx")
public class class370 {

    @ObfuscatedName("nx.a")
    public class366 field4371;

    @ObfuscatedName("nx.f")
    public int field4372 = 0;

    @ObfuscatedName("nx.c")
    public int field4373 = 0;

    public class370(class366 arg0, int arg1, int arg2) {
        this.field4371 = arg0;
        this.field4372 = arg1;
        this.field4373 = arg2;
    }

    @ObfuscatedName("nx.a(I)Ljava/lang/String;")
    public String method6530() {
        if (this.method6511()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6512());
        for (int var2 = this.field4372; var2 < this.field4373; var2++) {
            class368 var3 = this.field4371.method6301(var2);
            var1.append(var3.field4348);
        }
        return var1.toString();
    }

    @ObfuscatedName("nx.f(IB)Z")
    public boolean method6510(int arg0) {
        return this.field4371.method6328() == 2 || this.field4371.method6328() == 1 && (!this.field4371.field4331 || this.field4373 - 1 != arg0);
    }

    @ObfuscatedName("nx.c(I)Z")
    public boolean method6511() {
        return this.field4373 == this.field4372;
    }

    @ObfuscatedName("nx.x(I)I")
    public int method6512() {
        return this.field4373 - this.field4372;
    }

    @ObfuscatedName("nx.h(Lns;B)Z")
    public boolean method6513(class368 arg0) {
        if (this.field4371.field4339 == 2) {
            return true;
        } else if (this.field4371.field4339 == 0) {
            return false;
        } else {
            return this.field4371.method6302() != arg0;
        }
    }

    @ObfuscatedName("nx.j(B)I")
    public int method6523() {
        if (this.method6511()) {
            return 0;
        }
        class368 var1 = this.field4371.method6301(this.field4373 - 1);
        if (var1.field4348 == '\n') {
            return 0;
        } else if (this.method6513(var1)) {
            return this.field4371.field4336.field4350[42];
        } else {
            int var2 = this.field4371.field4336.field4350[var1.field4348];
            if (var2 == 0) {
                return var1.field4348 == '\t' ? this.field4371.field4336.field4350[32] * 3 : this.field4371.field4336.field4350[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("nx.y(I)Lpv;")
    public class438 method6515() {
        if (this.method6511()) {
            return new class438(0, 0);
        } else {
            class368 var1 = this.field4371.method6301(this.field4373 - 1);
            return new class438(var1.field4342 + this.method6523(), var1.field4344);
        }
    }

    @ObfuscatedName("nx.d(IB)Lns;")
    public class368 method6528(int arg0) {
        return arg0 >= 0 && arg0 < this.method6512() ? this.field4371.method6301(this.field4372 + arg0) : null;
    }
}
