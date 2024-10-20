package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eg")
public final class class143 implements Runnable {

    @ObfuscatedName("eg.k")
    public InputStream field2159;

    @ObfuscatedName("eg.h")
    public OutputStream field2157;

    @ObfuscatedName("eg.o")
    public Socket field2160;

    @ObfuscatedName("eg.z")
    public boolean field2154 = false;

    @ObfuscatedName("eg.c")
    public class136 field2156;

    @ObfuscatedName("eg.d")
    public class146 field2158;

    @ObfuscatedName("eg.l")
    public byte[] field2155;

    @ObfuscatedName("eg.b")
    public int field2153 = 0;

    @ObfuscatedName("eg.j")
    public int field2161 = 0;

    @ObfuscatedName("eg.f")
    public boolean field2162 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2156 = arg1;
        this.field2160 = arg0;
        this.field2160.setSoTimeout(30000);
        this.field2160.setTcpNoDelay(true);
        this.field2160.setReceiveBufferSize(16384);
        this.field2160.setSendBufferSize(16384);
        this.field2159 = this.field2160.getInputStream();
        this.field2157 = this.field2160.getOutputStream();
    }

    @ObfuscatedName("eg.o(B)V")
    public void method2830() {
        if (this.field2154) {
            return;
        }
        synchronized (this) {
            this.field2154 = true;
            this.notifyAll();
        }
        if (this.field2158 != null) {
            while (this.field2158.field2195 == 0) {
                class127.method890(1L);
            }
            if (this.field2158.field2195 == 1) {
                try {
                    ((Thread) this.field2158.field2197).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2158 = null;
    }

    public void finalize() {
        this.method2830();
    }

    @ObfuscatedName("eg.z(I)I")
    public int method2832() throws IOException {
        return this.field2154 ? 0 : this.field2159.read();
    }

    @ObfuscatedName("eg.c(B)I")
    public int method2833() throws IOException {
        return this.field2154 ? 0 : this.field2159.available();
    }

    @ObfuscatedName("eg.d([BIIS)V")
    public void method2845(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2154) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2159.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eg.l([BIIB)V")
    public void method2835(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2154) {
            return;
        }
        if (this.field2162) {
            this.field2162 = false;
            throw new IOException();
        }
        if (this.field2155 == null) {
            this.field2155 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2155[this.field2161] = arg0[arg1 + var5];
                this.field2161 = (this.field2161 + 1) % 5000;
                if ((this.field2153 + 4900) % 5000 == this.field2161) {
                    throw new IOException();
                }
            }
            if (this.field2158 == null) {
                this.field2158 = this.field2156.method2702(this, 3);
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
                        if (this.field2161 == this.field2153) {
                            if (this.field2154) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2153;
                        if (this.field2161 >= this.field2153) {
                            var4 = this.field2161 - this.field2153;
                        } else {
                            var4 = 5000 - this.field2153;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2157.write(this.field2155, var3, var4);
                    } catch (IOException var12) {
                        this.field2162 = true;
                    }
                    this.field2153 = (this.field2153 + var4) % 5000;
                    try {
                        if (this.field2161 == this.field2153) {
                            this.field2157.flush();
                        }
                    } catch (IOException var11) {
                        this.field2162 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2159 != null) {
                        this.field2159.close();
                    }
                    if (this.field2157 != null) {
                        this.field2157.close();
                    }
                    if (this.field2160 != null) {
                        this.field2160.close();
                    }
                } catch (IOException var10) {
                }
                this.field2155 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method725((String) null, var15);
        }
    }
}
