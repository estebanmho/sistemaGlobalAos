# coding: utf-8

"""
    Subsistema 5: Gestión y emisión de facturas

    Asignatura AOS: grupo 8  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: aosgrupo8@aos.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Factura(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'factura_id': 'int',
        'id_cliente': 'int',
        'conceptos': 'list[SchemasTrabajoYml]',
        'fecha_emision': 'datetime',
        'importe': 'float',
        'links': 'object'
    }

    attribute_map = {
        'factura_id': 'facturaId',
        'id_cliente': 'idCliente',
        'conceptos': 'Conceptos',
        'fecha_emision': 'fechaEmision',
        'importe': 'importe',
        'links': 'links'
    }

    def __init__(self, factura_id=None, id_cliente=None, conceptos=None, fecha_emision=None, importe=None, links=None):  # noqa: E501
        """Factura - a model defined in Swagger"""  # noqa: E501
        self._factura_id = None
        self._id_cliente = None
        self._conceptos = None
        self._fecha_emision = None
        self._importe = None
        self._links = None
        self.discriminator = None
        if factura_id is not None:
            self.factura_id = factura_id
        if id_cliente is not None:
            self.id_cliente = id_cliente
        if conceptos is not None:
            self.conceptos = conceptos
        if fecha_emision is not None:
            self.fecha_emision = fecha_emision
        if importe is not None:
            self.importe = importe
        if links is not None:
            self.links = links

    @property
    def factura_id(self):
        """Gets the factura_id of this Factura.  # noqa: E501

        Identificador de la factura  # noqa: E501

        :return: The factura_id of this Factura.  # noqa: E501
        :rtype: int
        """
        return self._factura_id

    @factura_id.setter
    def factura_id(self, factura_id):
        """Sets the factura_id of this Factura.

        Identificador de la factura  # noqa: E501

        :param factura_id: The factura_id of this Factura.  # noqa: E501
        :type: int
        """

        self._factura_id = factura_id

    @property
    def id_cliente(self):
        """Gets the id_cliente of this Factura.  # noqa: E501

        Identificador del cliente a facturar  # noqa: E501

        :return: The id_cliente of this Factura.  # noqa: E501
        :rtype: int
        """
        return self._id_cliente

    @id_cliente.setter
    def id_cliente(self, id_cliente):
        """Sets the id_cliente of this Factura.

        Identificador del cliente a facturar  # noqa: E501

        :param id_cliente: The id_cliente of this Factura.  # noqa: E501
        :type: int
        """

        self._id_cliente = id_cliente

    @property
    def conceptos(self):
        """Gets the conceptos of this Factura.  # noqa: E501

        Trabajos pertenecientes a la factura  # noqa: E501

        :return: The conceptos of this Factura.  # noqa: E501
        :rtype: list[SchemasTrabajoYml]
        """
        return self._conceptos

    @conceptos.setter
    def conceptos(self, conceptos):
        """Sets the conceptos of this Factura.

        Trabajos pertenecientes a la factura  # noqa: E501

        :param conceptos: The conceptos of this Factura.  # noqa: E501
        :type: list[SchemasTrabajoYml]
        """

        self._conceptos = conceptos

    @property
    def fecha_emision(self):
        """Gets the fecha_emision of this Factura.  # noqa: E501

        Fecha de emisión de la factura  # noqa: E501

        :return: The fecha_emision of this Factura.  # noqa: E501
        :rtype: datetime
        """
        return self._fecha_emision

    @fecha_emision.setter
    def fecha_emision(self, fecha_emision):
        """Sets the fecha_emision of this Factura.

        Fecha de emisión de la factura  # noqa: E501

        :param fecha_emision: The fecha_emision of this Factura.  # noqa: E501
        :type: datetime
        """

        self._fecha_emision = fecha_emision

    @property
    def importe(self):
        """Gets the importe of this Factura.  # noqa: E501

        Importe total de la factura. Suma de todos los importes.  # noqa: E501

        :return: The importe of this Factura.  # noqa: E501
        :rtype: float
        """
        return self._importe

    @importe.setter
    def importe(self, importe):
        """Sets the importe of this Factura.

        Importe total de la factura. Suma de todos los importes.  # noqa: E501

        :param importe: The importe of this Factura.  # noqa: E501
        :type: float
        """

        self._importe = importe

    @property
    def links(self):
        """Gets the links of this Factura.  # noqa: E501

        Enlaces de relación  # noqa: E501

        :return: The links of this Factura.  # noqa: E501
        :rtype: object
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this Factura.

        Enlaces de relación  # noqa: E501

        :param links: The links of this Factura.  # noqa: E501
        :type: object
        """

        self._links = links

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(Factura, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Factura):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
