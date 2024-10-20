package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("z")
public class class17 {

    @ObfuscatedName("z.t")
    public int field242;

    @ObfuscatedName("z.o")
    public class133 field240;

    @ObfuscatedName("z.i")
    public byte[] field239 = new byte[4];

    @ObfuscatedName("z.p")
    public DataInputStream field241;

    @ObfuscatedName("z.c")
    public int field245;

    @ObfuscatedName("z.y")
    public byte[] field244;

    @ObfuscatedName("z.g")
    public int field246;

    @ObfuscatedName("z.l")
    public long field243;

    public class17(class123 arg0, URL arg1) {
        this.field240 = arg0.method2452(arg1);
        this.field242 = 0;
        this.field243 = class103.method1861() + 30000L;
    }

    @ObfuscatedName("z.t(B)[B")
    public byte[] method156() throws IOException {
        if (class103.method1861() > this.field243) {
            throw new IOException();
        }
        if (this.field242 == 0) {
            if (this.field240.field2036 == 2) {
                throw new IOException();
            }
            if (this.field240.field2036 == 1) {
                this.field241 = (DataInputStream) this.field240.field2039;
                this.field242 = 1;
            }
        }
        if (this.field242 == 1) {
            int var1 = this.field241.available();
            if (var1 > 0) {
                if (this.field245 + var1 > 4) {
                    var1 = 4 - this.field245;
                }
                this.field245 += this.field241.read(this.field239, this.field245, var1);
                if (this.field245 == 4) {
                    int var2 = (new class107(this.field239)).method2152();
                    this.field244 = new byte[var2];
                    this.field242 = 2;
                }
            }
        }
        if (this.field242 == 2) {
            int var3 = this.field241.available();
            if (var3 > 0) {
                if (this.field246 + var3 > this.field244.length) {
                    var3 = this.field244.length - this.field246;
                }
                this.field246 += this.field241.read(this.field244, this.field246, var3);
                if (this.field246 == this.field244.length) {
                    return this.field244;
                }
            }
        }
        return null;
    }
}
