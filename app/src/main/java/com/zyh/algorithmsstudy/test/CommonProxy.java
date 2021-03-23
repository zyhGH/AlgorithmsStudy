package com.zyh.algorithmsstudy.test;

public class CommonProxy {
    interface Subject {
        void find();
    }

    static class RealSubject implements Subject {

        @Override
        public void find() {
            System.out.println("狗娃");
        }
    }

    static class ProxySubject implements Subject {
        private Subject subject;

        ProxySubject() {
            subject = new RealSubject();
        }

        @Override
        public void find() {
            System.out.println("狗娃前");
            subject.find();
            System.out.println("狗娃后");
        }
    }

    public static void main(String[] args) {
        Subject proxy = new ProxySubject();
        proxy.find();
    }
}
