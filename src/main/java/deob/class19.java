package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class19 {

    @ObfuscatedName("r.l")
    public int field268;

    @ObfuscatedName("r.e")
    public class146 field263;

    @ObfuscatedName("r.q")
    public DataInputStream field264;

    @ObfuscatedName("r.o")
    public byte[] field265 = new byte[4];

    @ObfuscatedName("r.g")
    public int field266;

    @ObfuscatedName("r.m")
    public byte[] field267;

    @ObfuscatedName("r.b")
    public int field274;

    @ObfuscatedName("r.p")
    public long field269;

    public class19(class136 arg0, URL arg1) {
        this.field263 = arg0.method2735(arg1);
        this.field268 = 0;
        this.field269 = class115.method2266() + 30000L;
    }

    @ObfuscatedName("r.l(B)[B")
    public byte[] method190() throws IOException {
        if (class115.method2266() > this.field269) {
            throw new IOException();
        }
        if (this.field268 == 0) {
            if (this.field263.field2215 == 2) {
                throw new IOException();
            }
            if (this.field263.field2215 == 1) {
                this.field264 = (DataInputStream) this.field263.field2211;
                this.field268 = 1;
            }
        }
        if (this.field268 == 1) {
            int var1 = this.field264.available();
            if (var1 > 0) {
                if (this.field266 + var1 > 4) {
                    var1 = 4 - this.field266;
                }
                this.field266 += this.field264.read(this.field265, this.field266, var1);
                if (this.field266 == 4) {
                    int var2 = (new class119(this.field265)).method2393();
                    this.field267 = new byte[var2];
                    this.field268 = 2;
                }
            }
        }
        if (this.field268 == 2) {
            int var3 = this.field264.available();
            if (var3 > 0) {
                if (this.field274 + var3 > this.field267.length) {
                    var3 = this.field267.length - this.field274;
                }
                this.field274 += this.field264.read(this.field267, this.field274, var3);
                if (this.field274 == this.field267.length) {
                    return this.field267;
                }
            }
        }
        return null;
    }
}
