package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("y")
public class class19 {

    @ObfuscatedName("y.g")
    public int field267;

    @ObfuscatedName("y.b")
    public class146 field273;

    @ObfuscatedName("y.w")
    public DataInputStream field266;

    @ObfuscatedName("y.d")
    public byte[] field264 = new byte[4];

    @ObfuscatedName("y.z")
    public int field268;

    @ObfuscatedName("y.l")
    public byte[] field269;

    @ObfuscatedName("y.m")
    public int field265;

    @ObfuscatedName("y.p")
    public long field271;

    public class19(class136 arg0, URL arg1) {
        this.field273 = arg0.method2744(arg1);
        this.field267 = 0;
        this.field271 = class115.method579() + 30000L;
    }

    @ObfuscatedName("y.g(I)[B")
    public byte[] method194() throws IOException {
        if (class115.method579() > this.field271) {
            throw new IOException();
        }
        if (this.field267 == 0) {
            if (this.field273.field2216 == 2) {
                throw new IOException();
            }
            if (this.field273.field2216 == 1) {
                this.field266 = (DataInputStream) this.field273.field2217;
                this.field267 = 1;
            }
        }
        if (this.field267 == 1) {
            int var1 = this.field266.available();
            if (var1 > 0) {
                if (this.field268 + var1 > 4) {
                    var1 = 4 - this.field268;
                }
                this.field268 += this.field266.read(this.field264, this.field268, var1);
                if (this.field268 == 4) {
                    int var2 = (new class119(this.field264)).method2367();
                    this.field269 = new byte[var2];
                    this.field267 = 2;
                }
            }
        }
        if (this.field267 == 2) {
            int var3 = this.field266.available();
            if (var3 > 0) {
                if (this.field265 + var3 > this.field269.length) {
                    var3 = this.field269.length - this.field265;
                }
                this.field265 += this.field266.read(this.field269, this.field265, var3);
                if (this.field265 == this.field269.length) {
                    return this.field269;
                }
            }
        }
        return null;
    }
}
