package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("z")
public class class19 {

    @ObfuscatedName("z.j")
    public int field269;

    @ObfuscatedName("z.l")
    public class146 field267;

    @ObfuscatedName("z.a")
    public DataInputStream field257;

    @ObfuscatedName("z.i")
    public byte[] field258 = new byte[4];

    @ObfuscatedName("z.f")
    public int field259;

    @ObfuscatedName("z.m")
    public byte[] field263;

    @ObfuscatedName("z.o")
    public int field261;

    @ObfuscatedName("z.h")
    public long field262;

    public class19(class136 arg0, URL arg1) {
        this.field267 = arg0.method2670(arg1);
        this.field269 = 0;
        this.field262 = class115.method2249() + 30000L;
    }

    @ObfuscatedName("z.j(B)[B")
    public byte[] method194() throws IOException {
        if (class115.method2249() > this.field262) {
            throw new IOException();
        }
        if (this.field269 == 0) {
            if (this.field267.field2223 == 2) {
                throw new IOException();
            }
            if (this.field267.field2223 == 1) {
                this.field257 = (DataInputStream) this.field267.field2224;
                this.field269 = 1;
            }
        }
        if (this.field269 == 1) {
            int var1 = this.field257.available();
            if (var1 > 0) {
                if (this.field259 + var1 > 4) {
                    var1 = 4 - this.field259;
                }
                this.field259 += this.field257.read(this.field258, this.field259, var1);
                if (this.field259 == 4) {
                    int var2 = (new class119(this.field258)).method2321();
                    this.field263 = new byte[var2];
                    this.field269 = 2;
                }
            }
        }
        if (this.field269 == 2) {
            int var3 = this.field257.available();
            if (var3 > 0) {
                if (this.field261 + var3 > this.field263.length) {
                    var3 = this.field263.length - this.field261;
                }
                this.field261 += this.field257.read(this.field263, this.field261, var3);
                if (this.field261 == this.field263.length) {
                    return this.field263;
                }
            }
        }
        return null;
    }
}
