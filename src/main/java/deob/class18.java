package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class class18 {

    @ObfuscatedName("s.j")
    public int field281;

    @ObfuscatedName("s.y")
    public class141 field271;

    @ObfuscatedName("s.z")
    public DataInputStream field272;

    @ObfuscatedName("s.l")
    public byte[] field273 = new byte[4];

    @ObfuscatedName("s.w")
    public int field274;

    @ObfuscatedName("s.d")
    public byte[] field275;

    @ObfuscatedName("s.f")
    public int field284;

    @ObfuscatedName("s.i")
    public long field277;

    public class18(class131 arg0, URL arg1) {
        this.field271 = arg0.method2703(arg1);
        this.field281 = 0;
        this.field277 = Statics.method2875() + 30000L;
    }

    @ObfuscatedName("s.j(B)[B")
    public byte[] method179() throws IOException {
        if (Statics.method2875() > this.field277) {
            throw new IOException();
        }
        if (this.field281 == 0) {
            if (this.field271.field2124 == 2) {
                throw new IOException();
            }
            if (this.field271.field2124 == 1) {
                this.field272 = (DataInputStream) this.field271.field2118;
                this.field281 = 1;
            }
        }
        if (this.field281 == 1) {
            int var1 = this.field272.available();
            if (var1 > 0) {
                if (this.field274 + var1 > 4) {
                    var1 = 4 - this.field274;
                }
                this.field274 += this.field272.read(this.field273, this.field274, var1);
                if (this.field274 == 4) {
                    int var2 = (new class114(this.field273)).method2327();
                    this.field275 = new byte[var2];
                    this.field281 = 2;
                }
            }
        }
        if (this.field281 == 2) {
            int var3 = this.field272.available();
            if (var3 > 0) {
                if (this.field284 + var3 > this.field275.length) {
                    var3 = this.field275.length - this.field284;
                }
                this.field284 += this.field272.read(this.field275, this.field284, var3);
                if (this.field284 == this.field275.length) {
                    return this.field275;
                }
            }
        }
        return null;
    }
}
