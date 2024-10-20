package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class19 {

    @ObfuscatedName("x.y")
    public int field271;

    @ObfuscatedName("x.d")
    public class146 field264;

    @ObfuscatedName("x.g")
    public DataInputStream field274;

    @ObfuscatedName("x.w")
    public byte[] field266 = new byte[4];

    @ObfuscatedName("x.e")
    public int field267;

    @ObfuscatedName("x.c")
    public byte[] field273;

    @ObfuscatedName("x.a")
    public int field269;

    @ObfuscatedName("x.q")
    public long field265;

    public class19(class136 arg0, URL arg1) {
        this.field264 = arg0.method2693(arg1);
        this.field271 = 0;
        this.field265 = class115.method671() + 30000L;
    }

    @ObfuscatedName("x.y(I)[B")
    public byte[] method197() throws IOException {
        if (class115.method671() > this.field265) {
            throw new IOException();
        }
        if (this.field271 == 0) {
            if (this.field264.field2198 == 2) {
                throw new IOException();
            }
            if (this.field264.field2198 == 1) {
                this.field274 = (DataInputStream) this.field264.field2202;
                this.field271 = 1;
            }
        }
        if (this.field271 == 1) {
            int var1 = this.field274.available();
            if (var1 > 0) {
                if (this.field267 + var1 > 4) {
                    var1 = 4 - this.field267;
                }
                this.field267 += this.field274.read(this.field266, this.field267, var1);
                if (this.field267 == 4) {
                    int var2 = (new class119(this.field266)).method2331();
                    this.field273 = new byte[var2];
                    this.field271 = 2;
                }
            }
        }
        if (this.field271 == 2) {
            int var3 = this.field274.available();
            if (var3 > 0) {
                if (this.field269 + var3 > this.field273.length) {
                    var3 = this.field273.length - this.field269;
                }
                this.field269 += this.field274.read(this.field273, this.field269, var3);
                if (this.field269 == this.field273.length) {
                    return this.field273;
                }
            }
        }
        return null;
    }
}
