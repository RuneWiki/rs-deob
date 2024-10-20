package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("w")
public class class19 {

    @ObfuscatedName("w.f")
    public int field272;

    @ObfuscatedName("w.u")
    public class147 field268;

    @ObfuscatedName("w.x")
    public DataInputStream field265;

    @ObfuscatedName("w.b")
    public byte[] field266 = new byte[4];

    @ObfuscatedName("w.l")
    public int field267;

    @ObfuscatedName("w.d")
    public byte[] field273;

    @ObfuscatedName("w.n")
    public int field269;

    @ObfuscatedName("w.m")
    public long field264;

    public class19(class137 arg0, URL arg1) {
        this.field268 = arg0.method2731(arg1);
        this.field272 = 0;
        this.field264 = class116.method2672() + 30000L;
    }

    @ObfuscatedName("w.f(B)[B")
    public byte[] method202() throws IOException {
        if (class116.method2672() > this.field264) {
            throw new IOException();
        }
        if (this.field272 == 0) {
            if (this.field268.field2215 == 2) {
                throw new IOException();
            }
            if (this.field268.field2215 == 1) {
                this.field265 = (DataInputStream) this.field268.field2217;
                this.field272 = 1;
            }
        }
        if (this.field272 == 1) {
            int var1 = this.field265.available();
            if (var1 > 0) {
                if (this.field267 + var1 > 4) {
                    var1 = 4 - this.field267;
                }
                this.field267 += this.field265.read(this.field266, this.field267, var1);
                if (this.field267 == 4) {
                    int var2 = (new class120(this.field266)).method2527();
                    this.field273 = new byte[var2];
                    this.field272 = 2;
                }
            }
        }
        if (this.field272 == 2) {
            int var3 = this.field265.available();
            if (var3 > 0) {
                if (this.field269 + var3 > this.field273.length) {
                    var3 = this.field273.length - this.field269;
                }
                this.field269 += this.field265.read(this.field273, this.field269, var3);
                if (this.field269 == this.field273.length) {
                    return this.field273;
                }
            }
        }
        return null;
    }
}
