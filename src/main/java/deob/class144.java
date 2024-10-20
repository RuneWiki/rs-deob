package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eu")
public final class class144 implements Runnable {

    @ObfuscatedName("eu.t")
    public InputStream field2221;

    @ObfuscatedName("eu.i")
    public OutputStream field2210;

    @ObfuscatedName("eu.g")
    public Socket field2211;

    @ObfuscatedName("eu.h")
    public boolean field2212 = false;

    @ObfuscatedName("eu.z")
    public class137 field2217;

    @ObfuscatedName("eu.r")
    public class147 field2214;

    @ObfuscatedName("eu.f")
    public byte[] field2215;

    @ObfuscatedName("eu.s")
    public int field2216 = 0;

    @ObfuscatedName("eu.d")
    public int field2219 = 0;

    @ObfuscatedName("eu.l")
    public boolean field2218 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2217 = arg1;
        this.field2211 = arg0;
        this.field2211.setSoTimeout(30000);
        this.field2211.setTcpNoDelay(true);
        this.field2211.setReceiveBufferSize(16384);
        this.field2211.setSendBufferSize(16384);
        this.field2221 = this.field2211.getInputStream();
        this.field2210 = this.field2211.getOutputStream();
    }

    @ObfuscatedName("eu.g(I)V")
    public void method2786() {
        if (this.field2212) {
            return;
        }
        synchronized (this) {
            this.field2212 = true;
            this.notifyAll();
        }
        if (this.field2214 != null) {
            while (this.field2214.field2250 == 0) {
                class128.method894(1L);
            }
            if (this.field2214.field2250 == 1) {
                try {
                    ((Thread) this.field2214.field2247).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2214 = null;
    }

    public void finalize() {
        this.method2786();
    }

    @ObfuscatedName("eu.h(I)I")
    public int method2787() throws IOException {
        return this.field2212 ? 0 : this.field2221.read();
    }

    @ObfuscatedName("eu.z(I)I")
    public int method2806() throws IOException {
        return this.field2212 ? 0 : this.field2221.available();
    }

    @ObfuscatedName("eu.r([BIIB)V")
    public void method2789(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2212) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2221.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eu.f([BIII)V")
    public void method2790(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2212) {
            return;
        }
        if (this.field2218) {
            this.field2218 = false;
            throw new IOException();
        }
        if (this.field2215 == null) {
            this.field2215 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2215[this.field2219] = arg0[arg1 + var5];
                this.field2219 = (this.field2219 + 1) % 5000;
                if ((this.field2216 + 4900) % 5000 == this.field2219) {
                    throw new IOException();
                }
            }
            if (this.field2214 == null) {
                this.field2214 = this.field2217.method2701(this, 3);
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
                        if (this.field2219 == this.field2216) {
                            if (this.field2212) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2216;
                        if (this.field2219 >= this.field2216) {
                            var4 = this.field2219 - this.field2216;
                        } else {
                            var4 = 5000 - this.field2216;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2210.write(this.field2215, var3, var4);
                    } catch (IOException var12) {
                        this.field2218 = true;
                    }
                    this.field2216 = (this.field2216 + var4) % 5000;
                    try {
                        if (this.field2219 == this.field2216) {
                            this.field2210.flush();
                        }
                    } catch (IOException var11) {
                        this.field2218 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2221 != null) {
                        this.field2221.close();
                    }
                    if (this.field2210 != null) {
                        this.field2210.close();
                    }
                    if (this.field2211 != null) {
                        this.field2211.close();
                    }
                } catch (IOException var10) {
                }
                this.field2215 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method635((String) null, var15);
        }
    }
}
