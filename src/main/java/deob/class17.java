package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("m")
public class class17 {

    @ObfuscatedName("m.b")
    public int field248;

    @ObfuscatedName("m.u")
    public class133 field243;

    @ObfuscatedName("m.x")
    public DataInputStream field244;

    @ObfuscatedName("m.j")
    public byte[] field245 = new byte[4];

    @ObfuscatedName("m.o")
    public int field249;

    @ObfuscatedName("m.n")
    public byte[] field247;

    @ObfuscatedName("m.y")
    public int field242;

    @ObfuscatedName("m.f")
    public long field253;

    public class17(class123 arg0, URL arg1) {
        this.field243 = arg0.method2488(arg1);
        this.field248 = 0;
        this.field253 = class103.method29() + 30000L;
    }

    @ObfuscatedName("m.b(I)[B")
    public byte[] method165() throws IOException {
        if (class103.method29() > this.field253) {
            throw new IOException();
        }
        if (this.field248 == 0) {
            if (this.field243.field2070 == 2) {
                throw new IOException();
            }
            if (this.field243.field2070 == 1) {
                this.field244 = (DataInputStream) this.field243.field2069;
                this.field248 = 1;
            }
        }
        if (this.field248 == 1) {
            int var1 = this.field244.available();
            if (var1 > 0) {
                if (this.field249 + var1 > 4) {
                    var1 = 4 - this.field249;
                }
                this.field249 += this.field244.read(this.field245, this.field249, var1);
                if (this.field249 == 4) {
                    int var2 = (new class107(this.field245)).method2139();
                    this.field247 = new byte[var2];
                    this.field248 = 2;
                }
            }
        }
        if (this.field248 == 2) {
            int var3 = this.field244.available();
            if (var3 > 0) {
                if (this.field242 + var3 > this.field247.length) {
                    var3 = this.field247.length - this.field242;
                }
                this.field242 += this.field244.read(this.field247, this.field242, var3);
                if (this.field242 == this.field247.length) {
                    return this.field247;
                }
            }
        }
        return null;
    }
}
