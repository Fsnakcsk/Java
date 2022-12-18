using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lec10
{
    class Stack<Type>
    {
        static int MAX = 100;
        protected Type[] _s;
        protected int _top;
        protected int _size;
        private void initialize()
        {
            for (int i = 0; i < _size; i++)
            {
                _s[i] = default(Type); // default(type) 들어오는 type에 때라 <Type>에 int, double, String 어떤 Type들어 오느냐에 따라 (0), (0.0), (NULL)으로 자동으로 초기화가 됨
            }
        }
        private void overflowError()
        {
            Console.WriteLine("Stack Overflow Error");
            Environment.Exit(-1);
        }
        private void emptyError()
        {
            Console.WriteLine("Stack Empty Error");
            Environment.Exit(-1);
        }
        public Stack() :
            this(MAX)
        {
        }
        public Stack(int n)
        {
            _s = new Type[n];
            _size = n;
            _top = -1;
            initialize();
        }
        public void push(Type item)
        {
            if (_top >= _size - 1) overflowError();
            _top++;
            _s[_top] = item;
        }
        public Type pop()
        {
            if (_top == -1) emptyError();
            Type value = _s[_top];
            _top--;
            return (value);
        }
        public Type peek()
        {
            if (_top == -1) emptyError();
            return (_s[_top]);
        }
        public void reset()
        {
            _top = -1;
            initialize();
        }
        public bool isEmpty()
        {
            if (_top == -1) return true;
            else return false;
        }
    }
    class TestStack
    {
        static void Main(string[] args)
        {
            Stack<int> a = new Stack<int>(10);
            Stack<int> b = new Stack<int>(20);
            Stack<double> c = new Stack<double>(10);
            Stack<String> d = new Stack<String>(10);
            a.push(1);
            a.push(2);
            b.push(30);
            b.push(20);
            c.push(1.3);
            c.push(2.4);
            d.push("kim");
            d.push("lee");
            Console.WriteLine(a.pop());
            Console.WriteLine(a.pop());
            Console.WriteLine(b.pop());
            Console.WriteLine(b.pop());
            Console.WriteLine(c.pop());
            Console.WriteLine(c.peek());
            Console.WriteLine(d.peek());
            Console.WriteLine(d.pop());
            Console.WriteLine(a.isEmpty());
            Console.WriteLine(b.isEmpty());
            Console.WriteLine(c.isEmpty());
            Console.WriteLine(d.isEmpty());
        }
    }
}
