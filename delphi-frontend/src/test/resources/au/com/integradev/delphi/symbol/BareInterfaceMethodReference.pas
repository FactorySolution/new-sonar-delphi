unit BareInterfaceMethodReference;

interface

function Foo(Baz: Integer): Integer;
function ExternalFunc(Result: Boolean): Boolean;

implementation

procedure Bar(Flarp: Integer);
begin
  // Do nothing
end;

function Foo;
begin
  Bar(Baz);
end;

function ExternalFunc; external 'mydll.dll' name 'ExternalFunc';

end.