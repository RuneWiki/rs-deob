package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("er")
public final class class147 implements Runnable {

    @ObfuscatedName("er.a")
    public InputStream field2258;

    @ObfuscatedName("er.d")
    public OutputStream field2248;

    @ObfuscatedName("er.v")
    public Socket field2253;

    @ObfuscatedName("er.r")
    public boolean field2251 = false;

    @ObfuscatedName("er.z")
    public class140 field2252;

    @ObfuscatedName("er.t")
    public class150 field2250;

    @ObfuscatedName("er.n")
    public byte[] field2254;

    @ObfuscatedName("er.i")
    public int field2255 = 0;

    @ObfuscatedName("er.g")
    public int field2256 = 0;

    @ObfuscatedName("er.m")
    public boolean field2257 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2252 = arg1;
        this.field2253 = arg0;
        this.field2253.setSoTimeout(30000);
        this.field2253.setTcpNoDelay(true);
        this.field2253.setReceiveBufferSize(16384);
        this.field2253.setSendBufferSize(16384);
        this.field2258 = this.field2253.getInputStream();
        this.field2248 = this.field2253.getOutputStream();
    }

    @ObfuscatedName("er.d(I)V")
    public void method2891() {
        if (this.field2251) {
            return;
        }
        synchronized (this) {
            this.field2251 = true;
            this.notifyAll();
        }
        if (this.field2250 != null) {
            while (this.field2250.field2285 == 0) {
                class131.method674(1L);
            }
            if (this.field2250.field2285 == 1) {
                try {
                    ((Thread) this.field2250.field2288).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2250 = null;
    }

    public void finalize() {
        this.method2891();
    }

    @ObfuscatedName("er.v(B)I")
    public int method2874() throws IOException {
        return this.field2251 ? 0 : this.field2258.read();
    }

    @ObfuscatedName("er.r(I)I")
    public int method2873() throws IOException {
        return this.field2251 ? 0 : this.field2258.available();
    }

    @ObfuscatedName("er.z([BIII)V")
    public void method2887(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2251) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2258.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("er.t([BIII)V")
    public void method2877(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2251) {
            return;
        }
        if (this.field2257) {
            this.field2257 = false;
            throw new IOException();
        }
        if (this.field2254 == null) {
            this.field2254 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2254[this.field2256] = arg0[arg1 + var5];
                this.field2256 = (this.field2256 + 1) % 5000;
                if ((this.field2255 + 4900) % 5000 == this.field2256) {
                    throw new IOException();
                }
            }
            if (this.field2250 == null) {
                this.field2250 = this.field2252.method2794(this, 3);
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
                        if (this.field2256 == this.field2255) {
                            if (this.field2251) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2255;
                        if (this.field2256 >= this.field2255) {
                            var4 = this.field2256 - this.field2255;
                        } else {
                            var4 = 5000 - this.field2255;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2248.write(this.field2254, var3, var4);
                    } catch (IOException var12) {
                        this.field2257 = true;
                    }
                    this.field2255 = (this.field2255 + var4) % 5000;
                    try {
                        if (this.field2256 == this.field2255) {
                            this.field2248.flush();
                        }
                    } catch (IOException var11) {
                        this.field2257 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2258 != null) {
                        this.field2258.close();
                    }
                    if (this.field2248 != null) {
                        this.field2248.close();
                    }
                    if (this.field2253 != null) {
                        this.field2253.close();
                    }
                } catch (IOException var10) {
                }
                this.field2254 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method2703((String) null, var15);
        }
    }
}
