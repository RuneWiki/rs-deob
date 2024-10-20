package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("k")
public class class18 {

    @ObfuscatedName("k.n")
    public int field249;

    @ObfuscatedName("k.w")
    public class138 field240;

    @ObfuscatedName("k.i")
    public byte[] field242 = new byte[4];

    @ObfuscatedName("k.e")
    public DataInputStream field250;

    @ObfuscatedName("k.h")
    public int field244;

    @ObfuscatedName("k.q")
    public byte[] field247;

    @ObfuscatedName("k.l")
    public int field243;

    @ObfuscatedName("k.c")
    public long field246;

    public class18(class128 arg0, URL arg1) {
        this.field240 = arg0.method2529(arg1);
        this.field249 = 0;
        this.field246 = class107.method2784() + 30000L;
    }

    @ObfuscatedName("k.n(I)[B")
    public byte[] method164() throws IOException {
        if (class107.method2784() > this.field246) {
            throw new IOException();
        }
        if (this.field249 == 0) {
            if (this.field240.field2103 == 2) {
                throw new IOException();
            }
            if (this.field240.field2103 == 1) {
                this.field250 = (DataInputStream) this.field240.field2106;
                this.field249 = 1;
            }
        }
        if (this.field249 == 1) {
            int var1 = this.field250.available();
            if (var1 > 0) {
                if (this.field244 + var1 > 4) {
                    var1 = 4 - this.field244;
                }
                this.field244 += this.field250.read(this.field242, this.field244, var1);
                if (this.field244 == 4) {
                    int var2 = (new class111(this.field242)).method2160();
                    this.field247 = new byte[var2];
                    this.field249 = 2;
                }
            }
        }
        if (this.field249 == 2) {
            int var3 = this.field250.available();
            if (var3 > 0) {
                if (this.field243 + var3 > this.field247.length) {
                    var3 = this.field247.length - this.field243;
                }
                this.field243 += this.field250.read(this.field247, this.field243, var3);
                if (this.field243 == this.field247.length) {
                    return this.field247;
                }
            }
        }
        return null;
    }
}
