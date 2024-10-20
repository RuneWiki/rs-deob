package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eb")
public final class class144 implements Runnable {

    @ObfuscatedName("eb.b")
    public InputStream field2165;

    @ObfuscatedName("eb.g")
    public OutputStream field2161;

    @ObfuscatedName("eb.j")
    public Socket field2162;

    @ObfuscatedName("eb.d")
    public boolean field2163 = false;

    @ObfuscatedName("eb.x")
    public class137 field2164;

    @ObfuscatedName("eb.y")
    public class147 field2160;

    @ObfuscatedName("eb.r")
    public byte[] field2167;

    @ObfuscatedName("eb.c")
    public int field2171 = 0;

    @ObfuscatedName("eb.l")
    public int field2168 = 0;

    @ObfuscatedName("eb.u")
    public boolean field2169 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2164 = arg1;
        this.field2162 = arg0;
        this.field2162.setSoTimeout(30000);
        this.field2162.setTcpNoDelay(true);
        this.field2162.setReceiveBufferSize(16384);
        this.field2162.setSendBufferSize(16384);
        this.field2165 = this.field2162.getInputStream();
        this.field2161 = this.field2162.getOutputStream();
    }

    @ObfuscatedName("eb.d(I)V")
    public void method2841() {
        if (this.field2163) {
            return;
        }
        synchronized (this) {
            this.field2163 = true;
            this.notifyAll();
        }
        if (this.field2160 != null) {
            while (this.field2160.field2200 == 0) {
                class128.method2289(1L);
            }
            if (this.field2160.field2200 == 1) {
                try {
                    ((Thread) this.field2160.field2202).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2160 = null;
    }

    public void finalize() {
        this.method2841();
    }

    @ObfuscatedName("eb.x(I)I")
    public int method2842() throws IOException {
        return this.field2163 ? 0 : this.field2165.read();
    }

    @ObfuscatedName("eb.y(B)I")
    public int method2834() throws IOException {
        return this.field2163 ? 0 : this.field2165.available();
    }

    @ObfuscatedName("eb.r([BIII)V")
    public void method2835(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2163) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2165.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eb.c([BIII)V")
    public void method2836(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2163) {
            return;
        }
        if (this.field2169) {
            this.field2169 = false;
            throw new IOException();
        }
        if (this.field2167 == null) {
            this.field2167 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2167[this.field2168] = arg0[arg1 + var5];
                this.field2168 = (this.field2168 + 1) % 5000;
                if ((this.field2171 + 4900) % 5000 == this.field2168) {
                    throw new IOException();
                }
            }
            if (this.field2160 == null) {
                this.field2160 = this.field2164.method2741(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2171 == this.field2168) {
                            if (this.field2163) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2171;
                        if (this.field2168 >= this.field2171) {
                            var4 = this.field2168 - this.field2171;
                        } else {
                            var4 = 5000 - this.field2171;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2161.write(this.field2167, var3, var4);
                    } catch (IOException var12) {
                        this.field2169 = true;
                    }
                    this.field2171 = (this.field2171 + var4) % 5000;
                    try {
                        if (this.field2171 == this.field2168) {
                            this.field2161.flush();
                        }
                    } catch (IOException var11) {
                        this.field2169 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2165 != null) {
                        this.field2165.close();
                    }
                    if (this.field2161 != null) {
                        this.field2161.close();
                    }
                    if (this.field2162 != null) {
                        this.field2162.close();
                    }
                } catch (IOException var10) {
                }
                this.field2167 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method93((String) null, var15);
        }
    }
}
