package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("c")
public class class19 {

    @ObfuscatedName("c.a")
    public int field271;

    @ObfuscatedName("c.r")
    public class146 field269;

    @ObfuscatedName("c.f")
    public DataInputStream field266;

    @ObfuscatedName("c.s")
    public byte[] field268 = new byte[4];

    @ObfuscatedName("c.y")
    public int field265;

    @ObfuscatedName("c.e")
    public byte[] field270;

    @ObfuscatedName("c.g")
    public int field267;

    @ObfuscatedName("c.m")
    public long field272;

    public class19(class136 arg0, URL arg1) {
        this.field269 = arg0.method2727(arg1);
        this.field271 = 0;
        this.field272 = class115.method207() + 30000L;
    }

    @ObfuscatedName("c.a(I)[B")
    public byte[] method199() throws IOException {
        if (class115.method207() > this.field272) {
            throw new IOException();
        }
        if (this.field271 == 0) {
            if (this.field269.field2203 == 2) {
                throw new IOException();
            }
            if (this.field269.field2203 == 1) {
                this.field266 = (DataInputStream) this.field269.field2207;
                this.field271 = 1;
            }
        }
        if (this.field271 == 1) {
            int var1 = this.field266.available();
            if (var1 > 0) {
                if (this.field265 + var1 > 4) {
                    var1 = 4 - this.field265;
                }
                this.field265 += this.field266.read(this.field268, this.field265, var1);
                if (this.field265 == 4) {
                    int var2 = (new class119(this.field268)).method2350();
                    this.field270 = new byte[var2];
                    this.field271 = 2;
                }
            }
        }
        if (this.field271 == 2) {
            int var3 = this.field266.available();
            if (var3 > 0) {
                if (this.field267 + var3 > this.field270.length) {
                    var3 = this.field270.length - this.field267;
                }
                this.field267 += this.field266.read(this.field270, this.field267, var3);
                if (this.field267 == this.field270.length) {
                    return this.field270;
                }
            }
        }
        return null;
    }
}
