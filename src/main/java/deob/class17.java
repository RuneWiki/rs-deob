package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class17 {

    @ObfuscatedName("r.g")
    public int field244;

    @ObfuscatedName("r.v")
    public class133 field234;

    @ObfuscatedName("r.z")
    public DataInputStream field235;

    @ObfuscatedName("r.h")
    public byte[] field236 = new byte[4];

    @ObfuscatedName("r.k")
    public int field237;

    @ObfuscatedName("r.l")
    public byte[] field242;

    @ObfuscatedName("r.e")
    public int field239;

    @ObfuscatedName("r.j")
    public long field240;

    public class17(class123 arg0, URL arg1) {
        this.field234 = arg0.method2474(arg1);
        this.field244 = 0;
        this.field240 = class103.method19() + 30000L;
    }

    @ObfuscatedName("r.g(B)[B")
    public byte[] method155() throws IOException {
        if (class103.method19() > this.field240) {
            throw new IOException();
        }
        if (this.field244 == 0) {
            if (this.field234.field2081 == 2) {
                throw new IOException();
            }
            if (this.field234.field2081 == 1) {
                this.field235 = (DataInputStream) this.field234.field2083;
                this.field244 = 1;
            }
        }
        if (this.field244 == 1) {
            int var1 = this.field235.available();
            if (var1 > 0) {
                if (this.field237 + var1 > 4) {
                    var1 = 4 - this.field237;
                }
                this.field237 += this.field235.read(this.field236, this.field237, var1);
                if (this.field237 == 4) {
                    int var2 = (new class107(this.field236)).method2144();
                    this.field242 = new byte[var2];
                    this.field244 = 2;
                }
            }
        }
        if (this.field244 == 2) {
            int var3 = this.field235.available();
            if (var3 > 0) {
                if (this.field239 + var3 > this.field242.length) {
                    var3 = this.field242.length - this.field239;
                }
                this.field239 += this.field235.read(this.field242, this.field239, var3);
                if (this.field239 == this.field242.length) {
                    return this.field242;
                }
            }
        }
        return null;
    }
}
