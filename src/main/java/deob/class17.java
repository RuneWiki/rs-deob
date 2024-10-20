package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("z")
public class class17 {

    @ObfuscatedName("z.p")
    public int field247;

    @ObfuscatedName("z.g")
    public class133 field241;

    @ObfuscatedName("z.x")
    public DataInputStream field242;

    @ObfuscatedName("z.c")
    public byte[] field249 = new byte[4];

    @ObfuscatedName("z.n")
    public int field248;

    @ObfuscatedName("z.s")
    public byte[] field245;

    @ObfuscatedName("z.r")
    public int field246;

    @ObfuscatedName("z.w")
    public long field240;

    public class17(class123 arg0, URL arg1) {
        this.field241 = arg0.method2531(arg1);
        this.field247 = 0;
        this.field240 = class103.method550() + 30000L;
    }

    @ObfuscatedName("z.p(B)[B")
    public byte[] method157() throws IOException {
        if (class103.method550() > this.field240) {
            throw new IOException();
        }
        if (this.field247 == 0) {
            if (this.field241.field2053 == 2) {
                throw new IOException();
            }
            if (this.field241.field2053 == 1) {
                this.field242 = (DataInputStream) this.field241.field2055;
                this.field247 = 1;
            }
        }
        if (this.field247 == 1) {
            int var1 = this.field242.available();
            if (var1 > 0) {
                if (this.field248 + var1 > 4) {
                    var1 = 4 - this.field248;
                }
                this.field248 += this.field242.read(this.field249, this.field248, var1);
                if (this.field248 == 4) {
                    int var2 = (new class107(this.field249)).method2305();
                    this.field245 = new byte[var2];
                    this.field247 = 2;
                }
            }
        }
        if (this.field247 == 2) {
            int var3 = this.field242.available();
            if (var3 > 0) {
                if (this.field246 + var3 > this.field245.length) {
                    var3 = this.field245.length - this.field246;
                }
                this.field246 += this.field242.read(this.field245, this.field246, var3);
                if (this.field246 == this.field245.length) {
                    return this.field245;
                }
            }
        }
        return null;
    }
}
