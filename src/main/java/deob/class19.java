package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("z")
public class class19 {

    @ObfuscatedName("z.n")
    public int field272;

    @ObfuscatedName("z.q")
    public class146 field273;

    @ObfuscatedName("z.c")
    public DataInputStream field265;

    @ObfuscatedName("z.l")
    public byte[] field276 = new byte[4];

    @ObfuscatedName("z.r")
    public int field267;

    @ObfuscatedName("z.u")
    public byte[] field268;

    @ObfuscatedName("z.j")
    public int field269;

    @ObfuscatedName("z.w")
    public long field270;

    public class19(class136 arg0, URL arg1) {
        this.field273 = arg0.method2715(arg1);
        this.field272 = 0;
        this.field270 = class115.method179() + 30000L;
    }

    @ObfuscatedName("z.n(I)[B")
    public byte[] method195() throws IOException {
        if (class115.method179() > this.field270) {
            throw new IOException();
        }
        if (this.field272 == 0) {
            if (this.field273.field2200 == 2) {
                throw new IOException();
            }
            if (this.field273.field2200 == 1) {
                this.field265 = (DataInputStream) this.field273.field2204;
                this.field272 = 1;
            }
        }
        if (this.field272 == 1) {
            int var1 = this.field265.available();
            if (var1 > 0) {
                if (this.field267 + var1 > 4) {
                    var1 = 4 - this.field267;
                }
                this.field267 += this.field265.read(this.field276, this.field267, var1);
                if (this.field267 == 4) {
                    int var2 = (new class119(this.field276)).method2365();
                    this.field268 = new byte[var2];
                    this.field272 = 2;
                }
            }
        }
        if (this.field272 == 2) {
            int var3 = this.field265.available();
            if (var3 > 0) {
                if (this.field269 + var3 > this.field268.length) {
                    var3 = this.field268.length - this.field269;
                }
                this.field269 += this.field265.read(this.field268, this.field269, var3);
                if (this.field269 == this.field268.length) {
                    return this.field268;
                }
            }
        }
        return null;
    }
}
